package algorithms.medium.implementation

import algorithms.medium.implementation.MaxProduct.{maxProduct => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MaxProductTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(2, 3, -2, 4)) shouldBe 6
  }

  test("test1: sample input") {
    solve(Array(-2, 0, -1)) shouldBe 0
  }

  test("test2: -2 3 -4") {
    solve(Array(-2, 3, -4)) shouldBe 24
  }
}
