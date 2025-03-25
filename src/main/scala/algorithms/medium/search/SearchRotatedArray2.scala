package algorithms.medium.search

object SearchRotatedArray2 {

  /** RunTime Info: 304 ms, 48MB
    *
    * @param nums
    *   a rotated sort array contains duplicates
    * @param target
    *   the target search number
    * @return
    *   check the `target` consist in `nums`
    */
  def search(nums: Array[Int], target: Int): Boolean =
    nums.indexOf(target) >= 0
}
