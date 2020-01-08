package algorithms.medium.implementation

object SetMatrixZeros {

  /** RunTime Info:
    * 408 ms, 61 MB
    *
    * @param matrix 2D array
    */
  def setZeroes(matrix: Array[Array[Int]]): Unit = {
    val m = matrix.length
    val n = matrix.head.length
    var flag = false
    for (i <- 0 until m) {
      if (matrix(i)(0) == 0) flag = true
      for (j <- 1 until n) {
        if (matrix(i)(j) == 0) {
          matrix(i)(0) = 0
          matrix(0)(j) = 0
        }
      }
    }

    for (i <- 1 until m; j <- 1 until n
         if matrix(i)(0) == 0 || matrix(0)(j) == 0)
      matrix(i)(j) = 0

    if (matrix(0)(0) == 0) for (j <- 0 until n) matrix(0)(j) = 0

    if (flag) for (i <- 0 until m) matrix(i)(0) = 0
  }
}
