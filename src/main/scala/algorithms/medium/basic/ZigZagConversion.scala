package algorithms.medium.basic

object ZigZagConversion {

  /** RunTime Info: 388 ms, 52.7MB
    *
    * @param s
    *   input string
    * @param numRows
    *   the zig zag row number
    * @return
    *   converted string
    */
  def convert(s: String, numRows: Int): String = {
    if (numRows == 1) return s
    val res = Array.fill(numRows)("")
    val T = 2 * numRows - 2
    for (i <- s.indices) {
      val n = i % T
      if (n <= T / 2) {
        res(n) += s(i)
      } else {
        res(T - n) += s(i)
      }
    }
    res.mkString
  }
}
