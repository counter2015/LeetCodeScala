package algorithms.hard.string

object EditDistance {

  /** RunTime info:
    * 292 ms, 48.4 MB
    *
    * @param word1 string
    * @param word2 string
    * @return the distance of the two string
    */
  def minDistance(word1: String, word2: String): Int = {

    val m = word1.length
    val n = word2.length

    val dp = Array.fill(m + 1, n + 1)(0)
    for (i <- 1 to m) dp(i)(0) = i
    for (j <- 1 to n) dp(0)(j) = j
    for (i <- 1 to m; j <- 1 to n) {
      val a = dp(i)(j - 1) + 1
      val b = dp(i - 1)(j) + 1
      val c = if (word1(i - 1) == word2(j - 1)) dp(i - 1)(j - 1) else 1 + dp(i - 1)(j - 1)
      dp(i)(j) = a min b min c
    }
    dp(m)(n)
  }
}