package algorithms.easy.basic

object SearchInsert {

  /** RunTime Info: 264 ms, 48.4 MB
    *
    * @param nums
    *   sorted array
    * @param target
    *   number to insert
    * @return
    *   insert index
    */
  def searchInsert(nums: Array[Int], target: Int): Int = {
    var res = 0
    while (res < nums.length && target > nums(res))
      res += 1
    res
  }
}
