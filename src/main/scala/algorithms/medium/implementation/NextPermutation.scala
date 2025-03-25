package algorithms.medium.implementation

object NextPermutation {

  /** RunTime Info: 308 ms, 51.6 MB
    *
    * @param nums
    *   input array
    */
  def nextPermutation(nums: Array[Int]): Unit = {

    def swap(i: Int, j: Int): Unit = {
      val temp = nums(i)
      nums(i) = nums(j)
      nums(j) = temp
    }

    @scala.annotation.tailrec
    def reverse(l: Int, r: Int): Unit =
      if (l < r) {
        swap(l, r)
        reverse(l + 1, r - 1)
      }

    val n = nums.length
    val index = n - 1 - (n - 2 to 0 by -1).takeWhile(i => nums(i) >= nums(i + 1)).length
    if (index == 0) {
      reverse(0, n - 1)
    } else {
      val l = index - 1
      val r = n - 1 - (n - 1 to l + 1 by -1).takeWhile(i => nums(i) <= nums(l)).length
      swap(l, r)
      reverse(l + 1, n - 1)
    }
  }
}
