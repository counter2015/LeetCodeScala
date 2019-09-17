package algorithms.hard.implementation

object JumpGame2 {

  /** RunTime Info:
    * 320 ms, 50.8 MB
    *
    * @param nums integer array
    * @return minimum jump steps
    */
  def jump(nums: Array[Int]): Int = {
    var (ans, last, cur) = (0, 0, 0)
    for (i <- nums.indices) {
      if (i > last) {
        last = cur
        ans += 1
      }
      cur = math.max(cur, i + nums(i))
    }
    ans
  }
}
