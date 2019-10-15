package algorithms.medium.basic

object SortColors {

  /** RunTime Info:
    * 272 ms, 46.4 MB
    *
    * @param nums integer array only contains 0, 1, 2
    */
  def sortColors(nums: Array[Int]): Unit = {
    var (l, cur, r, temp) = (0, 0, nums.length - 1, 0)
    while (cur <= r) {
      nums(cur) match {
        case 0 =>
          temp = nums(l)
          nums(l) = nums(cur)
          nums(cur) = temp
          l += 1
          cur += 1
        case 1 =>
          cur += 1
        case 2 =>
          temp = nums(cur)
          nums(cur) = nums(r)
          nums(r) = temp
          r -= 1
      }
    }
  }
}
