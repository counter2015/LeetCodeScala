package algorithms.hard.implementation

object NQueens {

  /** RunTime Info: 340 ms, 50.2 MB
    *
    * @param n
    *   the board size
    * @return
    *   the solutions fo N-Queens
    */
  def solveNQueens(n: Int): List[List[String]] = {

    def underAttack(a: (Int, Int), b: (Int, Int)): Boolean =
      a._1 == b._1 || a._2 == b._2 || (b._2 - a._2).abs == (b._1 - a._1).abs

    def isSafe(queen: (Int, Int), queens: List[(Int, Int)]): Boolean =
      queens.forall(!underAttack(queen, _))

    def place(n: Int, size: Int): List[List[(Int, Int)]] =
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

    place(n, n).map(_.reverse.map(_._2)).map(_.map(qIndex => ("." * n).updated(qIndex, 'Q')))
  }
}
