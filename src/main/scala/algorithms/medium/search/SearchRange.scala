package algorithms.medium.search

object SearchRange {

  /** RunTime Info:
    * 296 ms, 52.4 MB
    *
    * @param nums   sorted array
    * @param target the number to find
    * @return the first and last index of target number
    */
  def searchRange(nums: Array[Int], target: Int): Array[Int] = {
    val n = nums.length

    @scala.annotation.tailrec
    def travel(l: Int, r: Int, fromLeft: Boolean): Int = {
      if (l > r) {
        -1
      } else {
        val m = (r - l) / 2 + l
        if (nums(m) == target) {
          if (fromLeft) {
            if (m == 0 || nums(m - 1) < target) m else travel(l, m - 1, fromLeft)
          } else {
            if (m == n - 1 || nums(m + 1) > target) m else travel(m + 1, r, fromLeft)
          }
        }
        else {
          if (nums(m) < target) travel(m + 1, r, fromLeft) else travel(l, m - 1, fromLeft)
        }
      }
    }

    Array(travel(0, n - 1, fromLeft = true), travel(0, n - 1, fromLeft = false))

  }

  /** RunTime Info:
    * 316 ms, 52.6MB
    *
    * @param nums   sorted array
    * @param target the number to find
    * @return the first and last index of target number
    */
  def searchRangeWTF(nums: Array[Int], target: Int): Array[Int] = {
    val start = nums.indexOf(target)
    val end = nums.lastIndexOf(target)
    Array(start, end)
  }
}
