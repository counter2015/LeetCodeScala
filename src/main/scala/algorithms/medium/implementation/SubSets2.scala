package algorithms.medium.implementation

object SubSets2 {

  /** RunTime Info:
    * 332 ms, 59.8 MB
    *
    * @param nums a array
    * @return distinct subsets
    */
  def subsetsWithDup(nums: Array[Int]): List[List[Int]] = {
    def subset(nums: List[Int]): List[List[Int]] = nums match {
      case Nil => List(List[Int]())
      case x :: xs =>
        val a = subset(xs)
        a.map(res => res ::: List(x)) ::: a
    }

    subset(nums.toList).map(_.sorted).distinct
  }
}
