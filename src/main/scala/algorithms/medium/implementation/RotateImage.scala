package algorithms.medium.implementation

object RotateImage {

  /** RunTime info:
    * 248 ms, 47.6 MB
    *
    * @param matrix input 2D array
    */
  def rotate(matrix: Array[Array[Int]]): Unit = {
    def rotateIt(m: Array[Array[Int]]): Array[Array[Int]] = m.reverse.transpose

    val n = matrix.length
    val res = rotateIt(matrix)
    for (i <- 0 until n; j <- 0 until n) matrix(i)(j) = res(i)(j)
  }
}
