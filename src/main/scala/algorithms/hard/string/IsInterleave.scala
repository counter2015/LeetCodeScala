package algorithms.hard.string

object IsInterleave {

  /** RunTime Info: 460ms, 52.2MB
    *
    * @param s1
    *   source string 1
    * @param s2
    *   source string 2
    * @param s3
    *   target string
    * @return
    */
  def isInterleave(s1: String, s2: String, s3: String): Boolean =
    if (s1.length + s2.length != s3.length) false
    else if (s1.length + s2.length + s3.length == 0) true
    else if (s1.length == 0 || s2.length == 0) s1 + s2 == s3
    else if (s1.head != s3.head && s2.head != s3.head) false
    else {
      val dp = Array.fill(s1.length + 1, s2.length + 1)(false)
      dp(0)(0) = true
      for (j <- 1 to s2.length) dp(0)(j) = dp(0)(j - 1) && s2(j - 1) == s3(j - 1)
      for (i <- 1 to s1.length) dp(i)(0) = dp(i - 1)(0) && s1(i - 1) == s3(i - 1)
      for (i <- 1 to s1.length; j <- 1 to s2.length)
        dp(i)(j) = (dp(i - 1)(j) && (s1(i - 1) == s3(i + j - 1))) || (dp(i)(j - 1) && (s2(j - 1) == s3(i + j - 1)))
      dp.last.last
    }

  /** RunTime Info: Time limit exceed.
    *
    * @param s1
    *   source string 1
    * @param s2
    *   source string 2
    * @param s3
    *   target string
    * @return
    */
  def isInterleaveF(s1: String, s2: String, s3: String): Boolean =
    if (s1.length + s2.length != s3.length) false
    else {
      if (s1.length + s2.length + s3.length == 0) true
      else if (s1.length == 0 || s2.length == 0) s1 + s2 == s3
      else if (s1.head != s3.head && s2.head != s3.head) false
      else {
        (s1.head == s3.head && isInterleave(s1.drop(1), s2, s3.drop(1))) ||
        (s2.head == s3.head && isInterleave(s1, s2.drop(1), s3.drop(1)))
      }
    }
}
