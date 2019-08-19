package algorithms.medium.string

object ValidParentheses {

  /** RunTime Info:
    * 252 ms, 49.1 MB
    *
    * @param s input string that only contains "[](){}"
    * @return whether the string is valid parentheses
    */
  def isValid(s: String): Boolean = {

    @scala.annotation.tailrec
    def travel(s: String, stack: String): Boolean = {
      if (s.length == 0) stack.length == 0
      else {
        s.head match {
          case '[' => travel(s.tail, stack + '[')
          case ']' => stack.length > 0 && stack.last == '[' && travel(s.tail, stack.init)
          case '(' => travel(s.tail, stack + '(')
          case ')' => stack.length > 0 && stack.last == '(' && travel(s.tail, stack.init)
          case '{' => travel(s.tail, stack + '{')
          case '}' => stack.length > 0 && stack.last == '{' && travel(s.tail, stack.init)
        }
      }
    }

    travel(s, "")
  }
}
