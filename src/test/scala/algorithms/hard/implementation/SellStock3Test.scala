package algorithms.hard.implementation

import algorithms.hard.implementation.SellStock3.{maxProfit => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SellStock3Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(3, 3, 5, 0, 0, 3, 1, 4)) shouldBe 6
  }

  test("test1: sample input") {
    solve(Array(1, 2, 3, 4, 5)) shouldBe 4
  }

  test("test2: sample input") {
    solve(Array(7, 6, 4, 3, 1)) shouldBe 0
  }

  test("test3: empty input") {
    solve(Array()) shouldBe 0
  }

  test("test4: custom test") {
    solve(Array(1, 2, 4, 2, 5, 7, 2, 4, 9, 0)) shouldBe 13
  }
}
