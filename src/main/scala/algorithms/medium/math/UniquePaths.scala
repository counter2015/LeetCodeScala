package algorithms.medium.math

object UniquePaths {

  /** RunTime Info:
    * 192 ms, 39.1 MB
    *
    * @param m columns
    * @param n rows
    * @return paths number
    */
  def uniquePaths(m: Int, n: Int): Int = {
    def C(M: Int, N: Int): Int = {
      (1 to N).foldLeft(1L)((ans, i) => ans * (M - N + i) / i).toInt
    }

    C(m + n - 2, m - 1)
  }
}
