package algorithms.hard.string

import algorithms.hard.string.LongestValidParentheses.{longestValidParentheses => solve}
import org.scalatest.{FunSuite, Matchers}

class LongestValidParenthesesTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve("(()") should be(2)
  }

  test("test1: sample input") {
    solve(")()())") should be(4)
  }

  test("test2: ()(()") {
    solve("()(()") should be(2)
  }

  test("test3: ()(()()((()(())") {
    solve("()(()()((()(())") should be(6)
  }
}
