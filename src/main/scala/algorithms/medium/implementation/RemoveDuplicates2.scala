package algorithms.medium.implementation

object RemoveDuplicates2 {

  /** RunTime Info: 308 ms, 51.1 MB
    *
    * @param nums
    *   a integer array with duplicates
    * @return
    *   the array after remove duplicates which don't contain more than two same element
    */
  def removeDuplicates(nums: Array[Int]): Int = {
    val n = nums.length
    if (n <= 1) {
      n
    } else {
      var (res, state, num) = (0, 0, 0)
      for (i <- 0 until n)
        if (i == 0) {
          num = nums(i)
          nums(res) = nums(i)
          state += 1
          res += 1
        } else {
          if (nums(i) == num) {
            state += 1
            if (state <= 2) {
              nums(res) = nums(i)
              res += 1
            }
          } else {
            num = nums(i)
            state = 1
            nums(res) = nums(i)
            res += 1
          }
        }
      res
    }
  }
}
