package algorithms.hard.implementation

object MaximalRectangle {

  /** RunTime info: 396 ms, 55.1 MB
    *
    * @param matrix
    *   a 2D array
    * @return
    *   the max area of rectangle
    */
  def maximalRectangle(matrix: Array[Array[Char]]): Int = {

    def largestRectangleArea(heights: Array[Int]): Int = {
      import scala.collection.mutable
      val s = mutable.Stack.empty[Int]
      val heightsFixed = heights :+ 0
      var res = 0
      var i = 0
      while (i < heightsFixed.length)
        if (s.isEmpty || heightsFixed(s.top) <= heightsFixed(i)) {
          s.push(i)
          i += 1
        } else {
          val index = s.pop()
          val height = heightsFixed(index)
          val area = height * (if (s.isEmpty) i else i - s.top - 1)
          res = res.max(area)
        }
      res
    }

    val m = matrix.length
    if (m == 0) {
      0
    } else {
      val n = matrix.head.length
      val dp = Array.fill(m, n)(0)
      dp(0)(0) = matrix(0)(0) - '0'
      for (j <- 0 until n)
        for (i <- 0 until m)
          dp(i)(j) = if (i == 0) {
            matrix(i)(j) - '0'
          } else {
            if (matrix(i)(j) - '0' == 0) 0 else 1 + dp(i - 1)(j)
          }

      var res = 0
      for (i <- 0 until m)
        res = res max largestRectangleArea(dp(i))
      res
    }
  }
}
