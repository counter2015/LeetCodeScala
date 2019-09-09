package algorithms.hard.implementation


object SolveSudoku {

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


/*
object Solution {
  val chooseList: List[Char] = "123456789".split("").map(_(0)).toList
  def solveSudoku(board: Array[Array[Char]]): Unit = {
    val b = board.map(_.toList).toList
    val res: List[List[Char]] = worker(b, 0.to(8).toList, 0.to(8).toList).head
    for (i<-0 to 8; j<-0 to 8) {
      board(i)(j) = res(i)(j)
    }
  }

  def okRow(board: List[List[Char]], a:Int, b:Int, v:Char) = {
    ! board(a).contains(v);
  }

  def okColumn(board: List[List[Char]], a:Int, b:Int, v:Char) = {
    ! (for (j<- 0 until 9) yield {
      board(j)(b);
    }).contains(v)
  }

  def okBlock(board: List[List[Char]], a:Int, b:Int, v:Char)  = {
    def matchX(x:Int) = {
      x match {
        case x if x <= 2 => 0 until 3;
        case x if x >= 6 => 6 until 9;
        case _ => 4 until 6;
      }
    }
    ! (for (i<-matchX(a); j<-matchX(b)) yield {
      board(i)(j);
    }).contains(v)
  }

  def okAll(board: List[List[Char]], a:Int, b:Int, v:Char) = {
    okRow(board, a, b, v) && okColumn(board, a, b, v) && okBlock(board, a, b, v)
  }

  //修改list的值，等效于 board(i)(j) = v
  def update2(board:List[List[Char]], i:Int ,j:Int , v:Char) : List[List[Char]] = {
    board.updated(i, board(i).updated(j, v))
  }

  // 选出b(i)(j) 处所有可能的结果集合
  def allUpdatable(b:List[List[Char]], i:Int, j:Int) = {
    b(i)(j) match {
      case '.' => chooseList.filter(okAll(b, i, j, _))
      case v => List(v)
    }
  }

  /*
    当 行为空，列只有一个元素时，
      返回b
    当 行为空，列含有多个元素时，
      ???
    当 行和列都有多个元素时，
      vs为当前i,j位置的所有可以更新的集合
      对于每一个v
        尝试构建出b(i)(j)的值更新为v的新的b1

    这个函数强行把二重循环写到递归调用里

   */
  def worker(b:List[List[Char]], is:List[Int], js:List[Int]):List[List[List[Char]]] = {
    (is, js) match {
      case (Nil, j::Nil) => List(b)
      case (Nil, j::jj) =>  worker(b, 0.to(8).toList, jj)
      case (i::ii, j::jj) =>
        val vs = allUpdatable(b, i, j)
        ( for ( v <- vs ) yield {
          val b1 = update2(b, i, j, v)
          worker( b1, ii, js ).take(1)
        } ).fold(Nil)(_++_).toList.take(1)
    }
  }



}*/
