package algorithms.medium.basic

object TwoSum2 {

  /** Runtime Info: 663 ms, 62.72 MB
    *
    * @param numbers
    * @param target
    * @return
    *   the 1 based index of array which sum to target
    */
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    val n = numbers.length
    var left = 0
    var right = n - 1
    while (numbers(left) + numbers(right) != target)
      if (numbers(left) + numbers(right) < target) {
        left += 1
      } else {
        right -= 1
      }

    // 1 based index
    Array(left + 1, right + 1)
  }
}
