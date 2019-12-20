package algorithms.medium.implementation

object GrayCode {

  /** RunTime Info:
    * 248 ms, 49.2 MB
    *
    * @param n the gray code length
    * @return a valid gray code list
    */
  def grayCode(n: Int): List[Int] = {

    def stringGrayCode(n: Int): List[String] = {
      if (n == 0) List("0")
      else if (n == 1) List("0", "1")
      else {
        val cur = stringGrayCode(n - 1)
        cur.map("0" + _) ++ cur.reverse.map("1" + _)
      }
    }

    stringGrayCode(n).map(Integer.parseInt(_, 2))
  }
}
