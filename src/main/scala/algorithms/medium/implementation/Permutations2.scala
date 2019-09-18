package algorithms.medium.implementation

object Permutations2 {

  /** RunTime Info:
    * 400 ms, 60.9 MB
    *
    * @param nums integer array
    * @return the permutation of input
    */
  def permuteUnique(nums: Array[Int]): List[List[Int]] =
    nums.permutations.toList.map(_.toList).distinct
}
