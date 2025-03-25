package algorithms.medium.implementation

object SpiralMatrix2 {

  /** RunTime Info: 204 ms, 44.3 MB
    *
    * @param n
    *   the matrix size
    * @return
    *   the spiral matrix
    */
  def generateMatrix(n: Int): Array[Array[Int]] = {
    if (n == 0) return Array(Array.empty[Int])

    val res = Array.fill(n, n)(0)
    var num = 1

    var x = 0
    var y = 0
    var nn = n
    while (nn > 0) {
      if (nn == 1) {
        res(x)(y) = num
      }

      for (i <- 0 until nn - 1)
        res(x)(y + i) = num + i
      y += nn - 1
      num += nn - 1

      for (i <- 0 until nn - 1)
        res(x + i)(y) = num + i
      x += nn - 1
      num += nn - 1

      for (i <- 0 until nn - 1)
        res(x)(y - i) = num + i
      y -= nn - 1
      num += nn - 1

      for (i <- 0 until nn - 1)
        res(x - i)(y) = num + i
      x -= nn - 1
      num += nn - 1

      x += 1
      y += 1
      nn -= 2
    }
    res
  }

}
