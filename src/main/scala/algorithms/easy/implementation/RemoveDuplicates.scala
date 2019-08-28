package algorithms.easy.implementation

object RemoveDuplicates {

  /** RunTime Info:
    * 1044 ms, 61 MB
    *
    * @param nums sorted array with duplicate numbers
    * @return distinct numbers
    */
  def removeDuplicates(nums: Array[Int]): Int = {
    val arr = nums.distinct
    arr.indices.foreach(i => nums(i) = arr(i))
    arr.length
  }
}
