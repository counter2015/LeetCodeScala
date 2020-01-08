package algorithms.medium.implementation


object GenerateParenthesis {

  /** RunTime Info:
    * 280 ms, 50.9 MB
    *
    * @param n the number of parenthesis
    * @return all combinations of well-formed parentheses.
    */
  def generateParenthesis(n: Int): List[String] = {
    import scala.collection.mutable.ArrayBuffer
    var res = ArrayBuffer.empty[String]

    def travel(l: Int, r: Int, curString: String): Unit = {
      if (l == 0 && r == 0) res += curString
      if (l > 0) travel(l - 1, r, curString + "(")
      if (r > l) travel(l, r - 1, curString + ")")
    }

    travel(n, n, "")
    res.toList
  }
}
