package algorithms.hard.implementation


object SolveSudoku {
  // scalastyle:off method.length
  // scalastyle:off magic.number
  /** RunTime Info:
    * 1272 ms, 57.6 MB
    *
    * @param board the sudoku problem
    */
  def solveSudoku(board: Array[Array[Char]]): Unit = {
    val n = 9

    val AllChoices: List[Char] = ('1' to '9').toList

    val boardList = board.map(_.toList).toList


    def updateBoard(board: List[List[Char]], row: Int, column: Int, value: Char): List[List[Char]] =
      board.updated(row, board(row).updated(column, value))

    def okAll(board: List[List[Char]], row: Int, column: Int, value: Char): Boolean = {
      def okRow: Boolean =
        !board(row).contains(value)


      def okColumn: Boolean =
        !(0 until n).map(row => board(row)(column)).contains(value)

      def okBlock: Boolean = {
        val blockValues =
          for (i <- row / 3 * 3 until row / 3 * 3 + 3;
               j <- column / 3 * 3 until column / 3 * 3 + 3) yield board(i)(j)
        !blockValues.contains(value)
      }

      okBlock && okColumn && okRow
    }


    def validValues(board: List[List[Char]], row: Int, column: Int): List[Char] =
      board(row)(column) match {
        case '.' => AllChoices.filter(okAll(board, row, column, _))
        case v => List(v)
      }

    def worker(board: List[List[Char]], row: Int, column: Int): List[List[List[Char]]] = {
      (row, column) match {
        case (8, 9) =>
          List(board)
        case (r, 9) =>
          worker(board, r + 1, 0)
        case (r, c) =>
          val vs = validValues(board, r, c)
          (for (value <- vs) yield {
            val newBoard = updateBoard(board, row, column, value)
            worker(newBoard, row, column + 1).take(1)
          }).fold(Nil)(_ ++ _).take(1)
      }
    }


    val res = worker(boardList, 0, 0).head
    for (i <- 0 until n; j <- 0 until n)
      board(i)(j) = res(i)(j)
  }

}
