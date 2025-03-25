package algorithms.hard.string

object PalindromePartition2 {

  /** RunTime Info: 576 ms, 50.1 MB
    *
    * @param s
    *   the string
    * @return
    *   the minCut of string
    */
  def minCut(s: String): Int = {
    val n = s.length
    val p = Array.fill(n, n)(false)
    val dp = Array.fill(n)(0)
    for (j <- 0 until n) {
      dp(j) = j
      for (i <- 0 to j)
        if (s(i) == s(j) && ((j - i < 2) || p(i + 1)(j - 1))) {
          p(i)(j) = true
          dp(j) = if (i == 0) 0 else dp(j) min dp(i - 1) + 1
        }
    }
    dp(n - 1)
  }
}
