package algorithms.medium.math

object NumTrees {

  /** RunTime Info: 404 ms, 54.2 MB
    *
    * @param n
    *   the number of tree
    * @return
    *   the result unique binary search trees number.
    */

  def numTrees(n: Int): Int = {

    def c(M: Long, N: Long): Long =
      (1L to N).foldLeft(1L)((ans, i) => ans * (M - N + i) / i)

    if (n <= 1) 1 else (c(2 * n, n) / (n + 1)).toInt
  }
}
