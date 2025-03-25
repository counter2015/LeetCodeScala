package algorithms.medium.implementation

object Triangle {

  /** RunTime Info: 876 ms, 65.8 MB
    *
    * @param triangle
    *   the triangle
    * @return
    *   the minimum sum of path
    */
  def minimumTotal(triangle: List[List[Int]]): Int = {
    val n = triangle.size
    val res = Array.fill(n)(Int.MaxValue)
    res(0) = triangle.head.head
    for (i <- 1 until n)
      for (j <- i to 0 by -1)
        res(j) =
          if (j == 0)
            res(j) + triangle(i)(j)
          else if (j == i)
            res(j - 1) + triangle(i)(j)
          else
            math.min(res(j - 1), res(j)) + triangle(i)(j)
    res.min
  }
}
