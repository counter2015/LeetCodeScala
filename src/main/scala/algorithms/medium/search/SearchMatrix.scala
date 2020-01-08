package algorithms.medium.search

import scala.collection.Searching._


object SearchMatrix {

  /** RunTime Info:
    * 300 ms, 50.7 MB
    *
    * @param matrix the 2D matrix
    * @param target the search number
    * @return check the matrix contains the target number or not
    */
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    if (matrix.length == 0 || matrix.head.length == 0) return false
    for (i <- matrix.indices) {
      val (head, last) = (matrix(i).head, matrix(i).last)
      if (head == target || last == target) {
        return true
      } else if (head < target || last > target) {
        val res = matrix(i).search(target) match {
          case InsertionPoint(_) => false
          case Found(_) => true
        }
        if (res) return true
      }
    }
    false
  }
}
