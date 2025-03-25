package algorithms.medium.implementation

object CombinationSum {

  /** RunTime Info: 344 ms, 56.2 MB
    *
    * @param candidates
    *   a integer array without duplicates
    * @param target
    *   sum
    * @return
    *   all unique combinations in `candidates` where the candidate numbers sums to `target`.
    */
  def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
    def combAcc(nums: List[Int], left: Int, acc: List[Int]): List[List[Int]] =
      if (left < 0) {
        Nil
      } else if (left == 0) {
        List(acc)
      } else {
        nums match {
          case Nil     => Nil
          case x :: xs => combAcc(x :: xs, left - x, x :: acc) ::: combAcc(xs, left, acc)
        }
      }

    combAcc(candidates.toList, target, Nil)
  }
}
