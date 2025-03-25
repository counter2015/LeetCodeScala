package algorithms.medium.search

object MinRotatedArray {

  /** RunTime Info: 692 ms, 64.1 MB
    *
    * @param nums
    *   the number of rotated array
    * @return
    *   the minimum number
    */
  def findMin(nums: Array[Int]): Int = {
    var left = 0
    var right = nums.length - 1
    while (left < right) {
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
