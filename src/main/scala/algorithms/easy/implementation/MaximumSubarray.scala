package algorithms.easy.implementation

object MaximumSubarray {

  /** RunTime Info:
    * 296 ms, 50.8 MB
    *
    * it would be better to use long, because when add two numbers it may overflow Integer Range
    * like input Array(-200, Int.MinValue, -2, -22)
    *
    * @param nums integer array
    * @return max subarray sum
    */
  def maxSubArray(nums: Array[Int]): Int = {
    nums.tail.foldLeft(nums(0).toLong, nums(0).toLong)((tuple: (Long, Long), x: Int) => {
      (math.max(tuple._1 + x, x), math.max(math.max(tuple._1 + x, x), tuple._2))
    })._2.toInt
  }


  /** RunTime Info:
    * 408 ms, 51.6 MB
    *
    * @param nums integer array
    * @return max subarray sum
    */
  def maxSubArrayImperative(nums: Array[Int]): Int = {
    var max: Long = nums(0)
    var cur: Long = nums(0)
    for (i <- 1 until nums.length) {
      cur = Math.max(cur + nums(i), nums(i))
      max = Math.max(max, cur)
    }
    max.toInt
  }
}
