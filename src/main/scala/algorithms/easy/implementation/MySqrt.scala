package algorithms.easy.implementation

object MySqrt {

  /** RunTime Info:
    * 220 ms, 40.9 MB
    *
    * @param x input integer
    * @return the sqrt integer result
    */
  def mySqrt(x: Int): Int = {
    val eps = 1e-7

    def sqr(x: Double): Double = {
      var ans = 1.0
      while (Math.abs(x / ans - ans) > eps) {
        ans = ((x / ans) + ans) / 2.0
      }
      ans
    }

    sqr(x.toDouble).toInt
  }
}
