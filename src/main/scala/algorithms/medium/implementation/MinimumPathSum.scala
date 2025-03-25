package algorithms.medium.implementation

object MinimumPathSum {

  /** RunTime Info: 300 ms, 58 MB
    *
    * @param grid
    *   the grids states
    * @return
    *   minimum path sum of grids
    */
  def minPathSum(grid: Array[Array[Int]]): Int = {

    val m = grid.length
    val n = grid.head.length
    val res = Array.fill(m, n)(0)
    for (i <- 0 until m; j <- 0 until n) {
      val top = if (i - 1 >= 0) res(i - 1)(j) else Int.MaxValue
      val left = if (j - 1 >= 0) res(i)(j - 1) else Int.MaxValue
      if (i == 0 && j == 0) res(i)(j) = grid(i)(j) else res(i)(j) = grid(i)(j) + math.min(top, left)
    }
    res(m - 1)(n - 1)
  }
}
