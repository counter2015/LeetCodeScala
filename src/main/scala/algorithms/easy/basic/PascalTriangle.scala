package algorithms.easy.basic

object PascalTriangle {

  /** RunTime Info:
    * 684 ms, 59.8MB
    *
    * @param numRows the size of pascal triangle
    * @return the triangle
    */
  def generate(numRows: Int): List[List[Int]] = {

    def c(m: Int, n: Int): Int = {
      var a, b = 1L
      for (i <- 1 to (n min (m - n))) {
        a = a * (m + 1 - i)
        b = b * i
      }
      (a / b).toInt
    }

    val arr = Array.fill(numRows, numRows)(0)
    for (i <- 0 until numRows) {
      for (j <- 0 to i) {
        arr(i)(j) = c(i, j)
      }
    }

    arr.map(_.takeWhile(_ > 0).toList).toList

  }
}
