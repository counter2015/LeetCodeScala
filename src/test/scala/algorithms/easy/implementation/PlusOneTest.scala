package algorithms.easy.implementation

import algorithms.easy.implementation.PlusOne.{plusOne => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PlusOneTest extends AnyFunSuite with Matchers {

  test("test0: sample test") {
    solve(Array(1, 2, 3)) shouldBe Array(1, 2, 4)
  }

  test("test1: sample test") {
    solve(Array(4, 3, 2, 1)) shouldBe Array(4, 3, 2, 2)
  }

  test("test2: carry") {
    solve(Array(9, 9, 9, 9)) shouldBe Array(1, 0, 0, 0, 0)
  }

  test("test3: zero") {
    solve(Array(0)) shouldBe Array(1)
  }
}
