package algorithms.medium.implementation

object Pow {

  /** RunTime Info:
    * 248 ms, 41.8 MB
    *
    * @param x a double
    * @param n a integer
    * @return the result of `x^n`
    */
  def myPow(x: Double, n: Int): Double = {

    @scala.annotation.tailrec
    def run(x: Double, y: Double, n: Long): Double = {
      if (n < 0) {
        run(1.0 / x, 1.0 / y, -n)
      } else if (n > 0) {
        if (n % 2 == 0) {
          run(x * x, y, n / 2)
        } else {
          run(x * x, y * x, n / 2)
        }
      } else {
        y
      }
    }

    run(x, 1.0, n).formatted("%.5f").toDouble
  }
}
