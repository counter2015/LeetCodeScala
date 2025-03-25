package algorithms.easy.basic

object PascalTriangle2 {

  /** RunTime Info: 956 ms, 70.7 MB
    *
    * @param rowIndex
    *   the index of pascal triangle, starts from 0
    * @return
    *   the index row of pascal triangle
    */
  def getRow(rowIndex: Int): List[Int] =
    LazyList.iterate(Vector(1))(v => (0 +: v :+ 0).sliding(2).map(_.sum).toVector)(rowIndex).toList
}
