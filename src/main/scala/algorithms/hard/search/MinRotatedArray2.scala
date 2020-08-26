package algorithms.hard.search

object MinRotatedArray2 {

  /** RunTime Info:
    * 480 ms, 50.8 MB
    *
    * @param nums the number of rotated array
    * @return the minimum number
    */
  def findMin(nums: Array[Int]): Int = {
    var left = 0
    var right = nums.length - 1
    while (left < right) {
      while (left < right && nums(left) == nums(left + 1)) left += 1
      while (left < right && nums(right) == nums(right - 1)) right -= 1
      val mid = (right - left) / 2 + left
      if (nums(right) < nums(mid)) {
        left = mid + 1
      } else {
        right = mid
      }
    }
    nums(left)
  }
}
