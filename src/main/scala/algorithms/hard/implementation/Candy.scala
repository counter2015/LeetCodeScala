package algorithms.hard.implementation

object Candy {

  /** RunTime Info: 552 ms, 54.1 MB
    *
    * @param ratings
    *   the ratings of the children
    * @return
    *   minimum candies
    */
  def candy(ratings: Array[Int]): Int = {
    val res = Array.fill(ratings.length)(1)
    for (i <- 0 until ratings.length - 1)
      if (ratings(i + 1) > ratings(i) && res(i + 1) <= res(i)) res(i + 1) = res(i) + 1
    for (i <- ratings.length - 1 to 1 by -1)
      if (ratings(i) < ratings(i - 1) && res(i - 1) <= res(i)) res(i - 1) = res(i) + 1
    res.sum
  }
}
