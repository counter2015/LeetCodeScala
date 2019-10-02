package algorithms.medium.math

object UniquePaths2 {

  /** RunTime Info:
    * 260 ms, 44.5 MB
    *
    * @param obstacleGrid grids state
    * @return the total solutions number
    */
  def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
    val m = obstacleGrid.length
    val n = obstacleGrid.head.length


    val res = Array.fill(m, n)(0)

    for (i <- 0 until m; j <- 0 until n) {
      if (obstacleGrid(i)(j) == 1) res(i)(j) = 0
      else if (i == 0 && j == 0) res(i)(j) = 1
      else {
        if (i - 1 >= 0) res(i)(j) += res(i - 1)(j)
        if (j - 1 >= 0) res(i)(j) += res(i)(j - 1)
      }
    }
    res(m - 1)(n - 1)
  }
}
