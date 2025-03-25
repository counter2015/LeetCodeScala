package algorithms.hard.string

object MinimumWindowSubstring {

  /** RunTime Info: 436 ms, 54.9 MB
    *
    * @param s
    *   source string
    * @param t
    *   target string
    * @return
    *   the minimum length window string
    */
  def minWindow(s: String, t: String): String = {
    if (s.length == 0 || t.length == 0) return ""

    val tCount = collection.mutable.Map(t.toSeq.groupBy(identity).toList.map(x => (x._1, x._2.length)): _*)
    var (l, r, i, j, checked) = (-1, -1, 0, 0, 0)
    while (j < s.length) {
      val value = tCount.getOrElse(s(j), 0)
      if (value > 0) checked += 1
      tCount(s(j)) = value - 1
      if (checked == t.length) {
        while (i < j && tCount(s(i)) < 0) {
          tCount(s(i)) += 1
          i += 1
        }
        if (r == -1 || r - l > j - i) {
          l = i
          r = j
        }
        tCount(s(i)) += 1
        checked -= 1
        i += 1
      }
      j += 1
    }
    if (r == -1) "" else s.substring(l, r + 1)
  }

}
