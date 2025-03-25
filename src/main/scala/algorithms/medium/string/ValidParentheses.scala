package algorithms.medium.string

object ValidParentheses {

  /** RunTime Info: 252 ms, 49.1 MB
    *
    * @param s
    *   input string that only contains "[](){}"
    * @return
    *   whether the string is valid parentheses
    */
  def isValid(s: String): Boolean = {

    @scala.annotation.tailrec
    def travel(s: String, stack: String): Boolean =
      if (s.length == 0) {
        stack.length == 0
      } else {
        val leftBraces = Array('[', '(', '{')
        val rightBraces = Array(']', ')', '}')
        s.head match {
          case c: Char if leftBraces.contains(c) =>
            travel(s.tail, stack + c)
          case c: Char if rightBraces.contains(c) =>
            stack.length > 0 && stack.last == leftBraces(rightBraces.indexOf(c)) && travel(s.tail, stack.init)
        }
      }

    travel(s, "")
  }
}
