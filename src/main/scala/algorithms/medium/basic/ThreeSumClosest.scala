package algorithms.medium.basic

object ThreeSumClosest {

  /** RunTime Info:
    * 328 ms, 46.7 MB
    *
    * @param nums   input integer array
    * @param target input integer number
    * @return the sum of three element of `nums`, which is nearest to `target`
    */
  def threeSumClosest(nums: Array[Int], target: Int): Int = {

    val n = nums.length
    val arr = nums.sorted
    var res = arr(0) + arr(1) + arr(n - 1)
    var a = 0
    while (a < n - 2) {
      var b = a + 1
      var c = n - 1
      while (b < c) {
        val sum = arr(a) + arr(b) + arr(c)
        if (sum > target) c -= 1 else b += 1
        res = if (Math.abs(sum - target) < Math.abs(res - target)) sum else res
      }
      a += 1
    }
    res
  }
}
