package algorithms.medium.implementation

object Divide {

  /** RunTime Info: 240 ms, 41.6 MB
    *
    * @param dividend
    *   int
    * @param divisor
    *   int
    * @return
    *   int result
    */
  def divide(dividend: Int, divisor: Int): Int = {
    val res = BigInt(dividend) / BigInt(divisor)
    if (res > Int.MaxValue || res < Int.MinValue) Int.MaxValue else res.toInt
  }
}
