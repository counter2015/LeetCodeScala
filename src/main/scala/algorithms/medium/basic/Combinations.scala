package algorithms.medium.basic

object Combinations {

  /** RunTime Info: 2216 ms, 103.2 MB
    *
    * SEE HERE: https://leetcode.com/problems/combinations/discuss/171792/Scala-purely-functional
    *
    * @param n
    *   the combination range
    * @param k
    *   the choose number
    * @return
    *   all combinations
    */
  def combine(n: Int, k: Int): List[List[Int]] =
    (2 to k).foldLeft((1 to n).toList.map(List(_)))((acc: List[List[Int]], _: Int) =>
      acc.flatMap(list => (1 until list.head).map(_ +: list))
    )

  /** RunTime Info: 2064 ms, 84 MB
    *
    * @param n
    *   the combination range
    * @param k
    *   the choose number
    * @return
    *   all combinations
    */
  def combine2(n: Int, k: Int): List[List[Int]] = {
    def travel(cur: List[Int], res: List[List[Int]], takeNumber: Int): List[List[Int]] =
      if (takeNumber == 0) {
        res
      } else {
        val nextCurs: Seq[(Int, List[Int])] =
          for (c <- 0 to cur.length - takeNumber) yield (cur(c), cur.patch(0, Nil, c + 1))
        nextCurs.flatMap(x => travel(x._2, res.map(_ :+ x._1), takeNumber - 1)).distinct.toList
      }

    travel((1 to n).toList, List.fill(k)(List.empty[Int]), k)
  }
}
