package algorithms.medium.search

object FindPeakElement {

  /** RunTime Info: 704 ms, 50.5 MB
    *
    * @param nums
    *   the array of numbers
    * @return
    *   the peak index
    */
  def findPeakElement(nums: Array[Int]): Int = {
    var left = 0
    var right = nums.length - 1
    var mid = 0
    while (left < right) {
      mid = (right - left) / 2 + left
      if (nums(mid) < nums(mid + 1)) left = mid + 1
      else right = mid
    }
    left
  }
}
