package algorithms.easy.basic

object SingleNumber {

  /** RunTime Info: 520 ms, 52.6 MB
    *
    * @param nums
    *   the number array
    * @return
    *   the single number
    */
  def singleNumber(nums: Array[Int]): Int =
    nums.foldLeft(0)(_ ^ _)
}
