package algorithms.medium.implementation

import algorithms.medium.implementation.Divide.{divide => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class DivideTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(10, 3) shouldBe 3
  }

  test("test1: sample input") {
    solve(7, -3) shouldBe -2
  }

  test("test2: overflow") {
    solve(Int.MinValue, -1) shouldBe Int.MaxValue
  }
}
