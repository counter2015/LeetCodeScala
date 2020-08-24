package algorithms.medium.implementation

import algorithms.medium.implementation.EvalRPN.{evalRPN => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class EvalRPNTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val tokens = Array("2", "1", "+", "3", "*")
    solve(tokens) shouldBe 9
  }

  test("test1: sample input") {
    val tokens = Array("4", "13", "5", "/", "+")
    solve(tokens) shouldBe 6
  }

  test("test2: sample input") {
    val tokens = Array("10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+")
    solve(tokens) shouldBe 22
  }
}
