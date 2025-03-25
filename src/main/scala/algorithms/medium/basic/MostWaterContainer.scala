package algorithms.medium.basic

object MostWaterContainer {

  /** RunTime Info: 736 ms, 52.5 MB
    *
    * @param height
    *   a integer array stand the height of piece of wood
    * @return
    *   the max volume of container
    */
  def maxAreaB(height: Array[Int]): Int = {
    var res = 0
    for (i <- height.indices)
      for (j <- i until height.length)
        res = math.max(res, (j - i) * math.min(height(i), height(j)))
    res
  }

  /** RunTime Info: 324 ms, 50 MB
    *
    * @param height
    *   a integer array stand the height of piece of wood
    * @return
    *   the max volume of container
    */
  def maxArea(height: Array[Int]): Int = {

    @scala.annotation.tailrec
    def travel(left: Int, right: Int, res: Int): Int =
      if (left == right) {
        res
      } else if (height(left) <= height(right)) {
        travel(left + 1, right, math.max(res, (right - left) * height(left)))
      } else {
        travel(left, right - 1, math.max(res, (right - left) * height(right)))
      }

    travel(0, height.length - 1, 0)
  }
}
