package algorithms.medium.basic

object SubSets {

  /** RunTime Info:
    * 280 ms, 55.7 MB
    *
    * @param nums the distinct set elements
    * @return
    */
  def subsets(nums: Array[Int]): List[List[Int]] = {
    if (nums.isEmpty) List(List())
    else {
      val excludeResult = subsets(nums.tail)
      excludeResult ++ excludeResult.map(nums.head +: _)
    }
  }
}
