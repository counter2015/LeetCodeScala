package algorithms.easy.basic

import algorithms.easy.basic.SellStock2.{maxProfit => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SellStock2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(7, 1, 5, 3, 6, 4)) shouldBe 7
  }

  test("test1: sample input") {
    solve(Array(1, 2, 3, 4, 5)) shouldBe 4
  }

  test("test2: sample input") {
    solve(Array(7, 6, 4, 3, 1)) shouldBe 0
  }
}
