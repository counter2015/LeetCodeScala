package algorithms.hard.implementation

object FirstMissingPositive {

  /** RunTime Info: 268 ms, 44.4 MB
    *
    * @param nums
    *   an unsorted array
    * @return
    *   the first positive that `nums` doesn't contains
    */
  def firstMissingPositive(nums: Array[Int]): Int =
    if (nums.length == 0) 1 else (1 to nums.max).view.takeWhile(nums.contains).toIndexedSeq.length + 1
}
