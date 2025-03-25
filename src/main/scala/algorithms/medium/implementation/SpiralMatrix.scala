package algorithms.medium.implementation

object SpiralMatrix {

  /** RunTime Info: 244ms, 44MB
    *
    * @param matrix
    *   input matrix
    * @return
    *   matrix elements in spiral order
    */
  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    def snail(xs: List[List[Int]]): List[Int] = xs match {
      case Nil     => Nil
      case x :: xs => x ++ snail(xs.transpose.reverse)
    }

    snail(matrix.toList.map(_.toList))
  }
}
