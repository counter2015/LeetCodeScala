package algorithms.hard.regex

object RegularExpressionMatching {

  /** RunTime Info:
    * 688 ms, 53.4 MB
    *
    * @param s target string
    * @param p patter of regex to match
    * @return whether `s` is the pattern of `p`
    */
  def isMatch(s: String, p: String): Boolean = {

    if (p.length == 0) s.length == 0
    else if (p.length == 1) s.length == 1 && (s == p || p == ".")
    else {
      if (p(1) != '*') {
        s.length > 0 && (s.head == p.head || p.head == '.') && isMatch(s.tail, p.tail)
      } else {
        val a = isMatch(s, p.substring(2))
        val b = s.length > 0 && ((s.head == p.head || p.head == '.') && isMatch(s.tail, p))
        a || b
      }
    }

  }

}
