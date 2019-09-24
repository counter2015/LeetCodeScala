package algorithms.hard.implementation

object NQueens2 {

  /** RunTime Info:
    * 276 ms, 49.1 MB
    *
    * @param n the board size
    * @return solution number of n-queens
    */
  def totalNQueens(n: Int): Int = {
    def underAttack(a: (Int, Int), b: (Int, Int)): Boolean =
      a._1 == b._1 || a._2 == b._2 || (b._2 - a._2).abs == (b._1 - a._1).abs

    def isSafe(queen: (Int, Int), queens: List[(Int, Int)]): Boolean =
      queens.forall(!underAttack(queen, _))

    def place(n: Int, size: Int): List[List[(Int, Int)]] = {
      n match {
        case 0 => List(List())
        case _ =>
          for {
            queens <- place(n - 1, size)
            pos <- 0 until size
            queen = (n, pos)
            if isSafe(queen, queens)
          } yield queen :: queens
      }
    }

    place(n, n).length
  }
}
