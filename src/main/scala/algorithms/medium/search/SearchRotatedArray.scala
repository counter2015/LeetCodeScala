package algorithms.medium.search

object SearchRotatedArray {

  /** RunTime Info:
    * 276 ms, 46.8 MB
    *
    * @param nums   a rotated array after sorted
    * @param target the integer to find
    * @return the index if find otherwise -1
    */
  def search(nums: Array[Int], target: Int): Int = {
    if (nums.length == 0) return -1

    val n = nums.length

    @scala.annotation.tailrec
    def travel(l: Int, r: Int): Int = {
      // Preventing integer overflow
      if (l > r) return -1
      val m = (r - l) / 2 + l
      if (nums(m) == target) m
      else {
        if (nums(l) <= nums(m)) {
          if (target < nums(m) && target >= nums(l)) travel(l, m - 1)
          else travel(m + 1, r)
        } else {
          if (target <= nums(r) && target > nums(m)) travel(m + 1, r)
          else travel(l, m - 1)
        }
      }
    }

    travel(0, n - 1)
  }

  /** RunTime Info:
    * 280 ms, 45.1 MB
    *
    * @param nums   a rotated array after sorted
    * @param target the integer to find
    * @return the index if find otherwise -1
    */
  def searchWTF(nums: Array[Int], target: Int): Int = nums.indexOf(target)
}
