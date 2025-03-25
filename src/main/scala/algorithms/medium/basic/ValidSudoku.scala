package algorithms.medium.basic

// scalastyle:off magic.number
object ValidSudoku {

  /** RunTime Info: 440 ms, 59.2 MB
    *
    * @param board
    *   sudoku board
    * @return
    *   check the board valid or not
    */
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    val n = 9
    val rowValid = board.map(_.filter(_ != '.').mkString).forall(row => row.toSeq.distinct.length == row.length)

    def columnValid: Boolean = {
      for (i <- 0 until n) {
        val chars = for (j <- 0 until n if board(j)(i) != '.') yield board(j)(i)
        if (chars.distinct.length != chars.length) return false
      }
      true
    }

    def blockValid: Boolean = {
      val block = Array.fill(9)("")
      for (
        i <- 0 until n;
        j <- 0 until n
        if board(i)(j) != '.'
      )
        block((i / 3) * 3 + j / 3) += board(i)(j)

      block.map(_.toSeq).forall(block => block.distinct.length == block.length)
    }

    rowValid && columnValid && blockValid
  }
}
