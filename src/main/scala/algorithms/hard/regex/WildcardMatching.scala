package algorithms.hard.regex

object WildcardMatching {

  /** RunTime Info: 252 ms, 45.5 MB
    *
    * @param s
    *   source string
    * @param p
    *   pattern string
    * @return
    *   match or not
    */
  def isMatch(s: String, p: String): Boolean = {
    var i, j = 0
    var ipos, jpos = -1
    while (i < s.length)
      if (j < p.length && (s(i) == p(j) || p(j) == '?')) {
        i += 1
        j += 1
      } else if (j < p.length && p(j) == '*') {
        ipos = i
        jpos = j
        j += 1
      } else if (ipos >= 0) {
        ipos += 1
        i = ipos
        j = jpos + 1
      } else {
        return false
      }
    while (j < p.length && p(j) == '*') j += 1
    j == p.length
  }
}
