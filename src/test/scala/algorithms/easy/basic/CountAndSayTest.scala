package algorithms.easy.basic

import algorithms.easy.basic.CountAndSay.{countAndSay => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class CountAndSayTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(1) shouldBe "1"
  }

  test("test1: sample input") {
    solve(4) shouldBe "1211"
  }

  test("test2: n = 9") {
    solve(9) shouldBe "31131211131221"
  }
}
