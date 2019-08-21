package algorithms.medium.implementation

import algorithms.medium.implementation.GenerateParenthesis.{generateParenthesis => solve}
import org.scalatest.FunSuite

class GenerateParenthesisTest extends FunSuite {

  test("test0: sample input") {
    val res = List[String](
      "((()))",
      "(()())",
      "(())()",
      "()(())",
      "()()()"
    )
    assert(solve(3) == res)
  }

  test("test1: n = 1") {
    val res = List[String]("()")
    assert(solve(1) == res)
  }

  test("test2: n = 5") {
    val res: List[String] = "((((())))),(((()()))),(((())())),(((()))()),(((())))(),((()(()))),((()()())),((()())()),((()()))(),((())(())),((())()()),((())())(),((()))(()),((()))()(),(()((()))),(()(()())),(()(())()),(()(()))(),(()()(())),(()()()()),(()()())(),(()())(()),(()())()(),(())((())),(())(()()),(())(())(),(())()(()),(())()()(),()(((()))),()((()())),()((())()),()((()))(),()(()(())),()(()()()),()(()())(),()(())(()),()(())()(),()()((())),()()(()()),()()(())(),()()()(()),()()()()()".split(",").toList
    assert(solve(5) == res)
  }
}
