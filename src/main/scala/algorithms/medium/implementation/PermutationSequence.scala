package algorithms.medium.implementation

object PermutationSequence {

  /** RunTime Info:
    * 260 ms, 40.8 MB
    *
    * @param n the total numbers of sequence
    * @param k the index of list
    * @return kth list of n's permutation
    */
  def getPermutation(n: Int, k: Int): String = {

    def factor(i: Int): Int = i match {
      case 0 => 1
      case x => x * factor(x - 1)
    }

    @scala.annotation.tailrec
    def travel(remain: List[Int], res: List[Int], k: Int): List[Int] = {
      val xn = n - res.length - 1
      val x = factor(xn)
      val a = k / x
      val b = k % x
      if (b != 0) {
        travel(remain.patch(a, Nil, 1), res :+ remain(a), b)
      }
      else {
        (res :+ remain(a - 1)) ++ remain.patch(a - 1, Nil, 1).reverse
      }
    }

    travel((1 to n).toList, List(), k).mkString
  }
}
