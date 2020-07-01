package algorithms.hard.string

object DistinctSubsequences {

  /** RunTime Info:
    * 460 ms, 50.3 MB
    *
    * @param s source string
    * @param t target string
    * @return the number of distinct subsequences of **s** which equals **t**.
    */
  def numDistinct(s: String, t: String): Int = {
    val m = s.length
    val n = t.length
    val dp = Array.fill(n + 1, m + 1)(0)
    for (i <- 0 to m) {
      dp(0)(i) = 1
    }
    for (i <- 1 to n) {
      for (j <- 1 to m) {
        if (s(j - 1) == t(i - 1)) dp(i)(j) = dp(i - 1)(j - 1) + dp(i)(j - 1)
        else dp(i)(j) = dp(i)(j - 1)
      }
    }
    dp(n)(m)
  }
}
