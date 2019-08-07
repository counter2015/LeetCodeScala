package algorithms.medium.string


object LongestPalindrome {

  /** RunTime Info:
    * 288ms, 50.6MB
    *
    * @param s input string
    * @return the longest palindrome substring of s
    */
  def longestPalindrome(s: String): String = {

    def visit(left: Int, right: Int): Int = {
      var (l, r) = (left, right)
      while (l >= 0 && r < s.length && s(l) == s(r)) {
        l -= 1
        r += 1
      }
      r - l - 1
    }

    if (s.length <= 1) return s
    var res = ""
    var maxlen = 0
    for (i <- s.indices) {
      val len = math.max(visit(i, i), visit(i, math.min(i + 1, s.length - 1)))
      if (len > maxlen) {
        maxlen = len
        res = s.substring(i - (len - 1) / 2, i + len / 2 + 1)
      }
    }
    res
  }

  /** RunTime Info:
    * 276ms, 49.7MB
    * Manacher's Algorithm imperative implementation
    *
    * @param s input string
    * @return the longest palindrome substring of s
    */
  def ManachersAlgorithm(s: String): String = {

    import scala.collection.mutable.ArrayBuffer

    if (s.length <= 1) return s

    def preCode: String = s.mkString("#", "#", "#")

    val t = preCode
    var (c, r, center, len) = (0, -1, 0, 1)
    val p: ArrayBuffer[Int] = ArrayBuffer.empty[Int]

    for (i <- t.indices) {

      var res = if (r > i) math.min(p(2 * c - i), r - i) else 0
      while (t.indices.contains(i) && t(i + res) == t(i - res))
        res += 1

      if (r < i + res) {
        r = i + res
        c = i
      }

      if (res > len) {
        len = res
        center = i
      }
      p += res
    }

    s.substring((center - len + 1) / 2, (center + len - 1) / 2)
  }

}

