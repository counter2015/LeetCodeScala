package algorithms.medium.implementation

object DecodeWay {

  /** RunTime Info: 228 ms, 43 MB
    *
    * @param s
    *   decode string, not null
    * @return
    *   the number of decoding ways
    */
  def numDecodings(s: String): Int = {
    if (s.length == 1)
      if (s.head == '0') return 0 else return 1

    val dp = Array.fill(s.length + 1)(0)
    dp(0) = 1
    dp(1) = if (s.head == '0') 0 else 1
    for (i <- 1 until s.length) {
      if (s(i) > '0') dp(i + 1) += dp(i)
      if (s(i - 1) == '1' || (s(i - 1) == '2' && s(i) <= '6')) dp(i + 1) += dp(i - 1)
    }
    dp.last
  }

  /** RunTime Info: 2484 ms, 55.1 MB
    *
    * @param s
    *   decode string
    * @return
    *   the number of decoding ways
    */
  def numDecodingsSlow(s: String): Int =
    if (s.length <= 1) {
      if (s == "0") 0 else 1
    } else if (s.head == '1' || (s.head == '2' && s(1) <= '6')) {
      numDecodingsSlow(s.tail) + numDecodingsSlow(s.substring(2))
    } else if (s.head != '0') {
      numDecodingsSlow(s.tail)
    } else {
      0
    }
}
