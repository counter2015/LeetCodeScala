package algorithms.medium.string

import scala.collection.mutable.ListBuffer

object PalindromePartition {

  /** RunTime Info:
    * 604 ms, 62.3 MB
    *
    * @param s the input string
    * @return all possible substring of palindrome lists
    */
  def partition(s: String): List[List[String]] = {

    def isPalindrome(s: String): Boolean = {
      val n = s.length
      if (n == 0) return false
      for (i <- 0 until n / 2) {
        if (s(i) != s(n - 1 - i)) return false
      }
      true
    }

    val res = ListBuffer[List[String]]()

    def solve(s: String, cur: List[String]): Unit = {
      if (s.isEmpty) res += cur
      else {
        for (i <- 0 to s.length) {
          val next = s.slice(0, i)
          if (isPalindrome(next)) {
            solve(s.drop(i), next :: cur)
          }
        }
      }
    }

    solve(s, Nil)

    res.map(_.reverse).toList
  }
}
