package algorithms.easy.basic

import algorithms.easy.basic.SingleNumber.{singleNumber => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SingleNumberTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(2, 2, 1)) shouldBe 1
  }

  test("test1: sample input") {
    solve(Array(4, 1, 2, 1, 2)) shouldBe 4
  }
}
