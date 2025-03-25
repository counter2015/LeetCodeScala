package algorithms.hard.implementation

object ScrambleString {

  /** RunTime Info: 312 ms, 53.8 MB
    *
    * @param s1
    *   first string
    * @param s2
    *   second string
    * @return
    *   whether the s1, s2 is co-scramble
    */
  def isScramble(s1: String, s2: String): Boolean =
    if (s1.length != s2.length || s1.toSeq.sorted.unwrap != s2.toSeq.sorted.unwrap) {
      false
    } else if (s1 == s2 || s1.length == 0) {
      true
    } else {
      for (i <- 1 until s1.length) {
        val s11 = s1.substring(0, i)
        val s12 = s1.substring(i, s1.length)
        val s21 = s2.substring(0, i)
        val s22 = s2.substring(i, s2.length)
        val s23 = s2.substring(0, s2.length - i)
        val s24 = s2.substring(s2.length - i, s2.length)
        if (isScramble(s11, s21) && isScramble(s12, s22)) return true
        if (isScramble(s11, s24) && isScramble(s12, s23)) return true
      }
      false
    }
}
