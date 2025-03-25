package algorithms.hard.implementation

object TrappingRainWater {

  /** RunTime Info: 280 ms.48.8 MB
    *
    * @param height
    *   a integer array stands for trap height
    * @return
    *   trapping water volume
    */
  def trap(height: Array[Int]): Int =
    if (height.nonEmpty) {
      var sum = 0
      var (leftWall, rightWall) = (0, 0)
      var (l, r) = (0, height.length - 1)
      while (l < r)
        if (height(l) < height(r)) {
          if (leftWall < height(l)) {
            leftWall = height(l)
          } else {
            sum += math.min(leftWall, height(r)) - height(l)
          }
          l += 1
        } else {
          if (rightWall < height(r)) {
            rightWall = height(r)
          } else {
            sum += math.min(rightWall, height(l)) - height(r)
          }
          r -= 1
        }
      sum
    } else {
      0
    }
}
