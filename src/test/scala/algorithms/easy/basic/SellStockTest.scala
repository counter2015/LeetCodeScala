package algorithms.easy.basic

import algorithms.easy.basic.SellStock.{maxProfit => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SellStockTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(7, 1, 5, 3, 6, 4)) shouldBe 5
  }

  test("test1: sample input") {
    solve(Array(7, 6, 4, 3, 1)) shouldBe 0
  }
}
