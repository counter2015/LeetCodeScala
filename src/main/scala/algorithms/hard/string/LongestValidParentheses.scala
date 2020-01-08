package algorithms.hard.string

import scala.collection.mutable

object LongestValidParentheses {

  /** RunTime Info:
    * 276 ms, 49.2 MB
    *
    * @param s parentheses sequence
    * @return max valid parentheses length
    */
  def longestValidParentheses(s: String): Int = {

    val mark = Array.fill(s.length)(false)
    val stack = mutable.Stack.empty[Int]
    s.zipWithIndex.foreach(x => {
      val (ch, index) = (x._1, x._2)
      if (ch == '(') {
        stack.push(index)
      } else {
        if (stack.nonEmpty) {
          val item = stack.pop()
          mark(item) = true
          mark(index) = true
        }
      }
    })

    var cnt, res = 0
    for (m <- mark) {
      if (m) {
        cnt += 1
      } else {
        res = math.max(res, cnt)
        cnt = 0
      }
    }
    res = math.max(res, cnt)
    res
  }

}
