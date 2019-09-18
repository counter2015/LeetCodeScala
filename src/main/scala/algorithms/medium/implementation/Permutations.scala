package algorithms.medium.implementation

object Permutations {

  /** RunTime Info:
    * 360 ms, 60.8 MB
    *
    * @param nums integer array
    * @return the permutation of input
    */
  def permute(nums: Array[Int]): List[List[Int]] = {

    def rm(xs: List[Int], value: Int): List[Int] = xs match {
      case `value` :: tail => tail
      case x :: tail => x :: rm(tail, value)
      case _ => Nil
    }

    nums.length match {
      case 0 => List(List())
      case _ =>
        val res = for {x <- nums; xs <- permute(rm(nums.toList, x).toArray)} yield x :: xs
        res.toList
    }
  }

  /** RunTime Info:
    * 324 ms, 60.0MB
    *
    * @param nums integer array
    * @return the permutation of input
    */
  def permuteWTF(nums: Array[Int]): List[List[Int]] = nums.permutations.toList.map(_.toList)
}
