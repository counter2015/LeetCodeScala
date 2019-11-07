package algorithms.hard.implementation

object LargestRectangleHistogram {

  /** RunTime Info:
    * 340 ms, 51.2 MB
    *
    * @param heights each single histogram
    * @return the maximum area of histogram
    */
  def largestRectangleArea(heights: Array[Int]): Int = {
    import scala.collection.mutable
    val s = mutable.Stack.empty[Int]
    val heightsFixed = heights :+ 0
    var res = 0
    var i = 0
    while (i < heightsFixed.length) {
      if (s.isEmpty || heightsFixed(s.top) <= heightsFixed(i)) {
        s.push(i)
        i += 1
      }
      else {
        val index = s.pop()
        val height = heightsFixed(index)
        val area = height * (if (s.isEmpty) i else i - s.top - 1)
        res = res.max(area)
      }
    }
    res
  }
}
