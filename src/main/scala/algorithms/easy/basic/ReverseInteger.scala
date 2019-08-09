package algorithms.easy.basic

object ReverseInteger {

  /** RunTime Info:
    * 228ms, 40.4MB
    *
    * @param x input 32-bit integer
    * @return if x.reverse overflow integer's range, return 0, else return x.reverse
    */
  def reverse(x: Int): Int = {
    val sign = if (x >= 0) 1 else -1
    val i: Long = x.toString.reverse.filter(_.isDigit).toLong * sign
    if (i > Integer.MAX_VALUE || i < Integer.MIN_VALUE) 0
    else i.toInt
  }
}
