package algorithms.medium.implementation

object CombinationSum2 {

  /** RunTime Info: 364 ms, 55 MB
    *
    * @param candidates
    *   a integer array without duplicates
    * @param target
    *   sum
    * @return
    *   all unique combinations in `candidates` where the candidate numbers sums to `target`.
    */
  def combinationSum2(candidates: Array[Int], target: Int): List[List[Int]] = {
    def combAcc(nums: List[Int], left: Int, acc: List[Int]): List[List[Int]] =
      if (left < 0) {
        Nil
      } else if (left == 0) {
        List(acc)
      } else {
        nums match {
          case Nil     => Nil
          case x :: xs => combAcc(xs, left - x, x :: acc) ::: combAcc(xs, left, acc)
        }
      }

    combAcc(candidates.toList, target, Nil).map(_.sorted).distinct
  }
}
