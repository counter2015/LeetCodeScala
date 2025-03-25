package algorithms.hard.search

object MaximumGap {

  /** RunTime Info: 464 ms, 50.9 MB
    *
    * @param nums
    *   the array of numbers
    * @return
    *   the maximum difference between adjacent nums
    */
  def maximumGap(nums: Array[Int]): Int = {
    val n = nums.length
    if (n < 2) return 0
    val (min, max) = (nums.min, nums.max)
    val bucketSize = (max - min) / n + 1

    val mins = Array.fill(n)(Int.MaxValue)
    val maxs = Array.fill(n)(Int.MinValue)
    for (num <- nums) {
      val index = (num - min) / bucketSize
      mins(index) = mins(index) min num
      maxs(index) = maxs(index) max num
    }

    var res = 0
    var pre = 0
    for (i <- 1 until n if maxs(i) != Int.MinValue) {
      res = res max (mins(i) - maxs(pre))
      pre = i
    }
    res
  }
}
