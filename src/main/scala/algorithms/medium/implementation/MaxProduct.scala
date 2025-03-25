package algorithms.medium.implementation

object MaxProduct {

  /** RunTime Info: 472 ms, 50.5 MB
    *
    * @param nums
    *   the array
    * @return
    *   max product of the sub array
    */
  def maxProduct(nums: Array[Int]): Int = {
    var mi, ma, res = nums(0)
    for (i <- 1 until nums.length) {
      val a = mi * nums(i) min ma * nums(i) min nums(i)
      val b = mi * nums(i) max ma * nums(i) max nums(i)
      mi = a
      ma = b
      res = res max ma
    }
    res
  }
}
