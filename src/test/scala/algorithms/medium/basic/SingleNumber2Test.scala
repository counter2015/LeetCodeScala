package algorithms.medium.basic

import algorithms.medium.basic.SingleNumber2.{singleNumber => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SingleNumber2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(2, 2, 3, 2)) shouldBe 3
  }

  test("test1: sample input") {
    solve(Array(0, 1, 0, 1, 0, 1, 99)) shouldBe 99
  }

  test("test2: negative number") {
    solve(Array(-2, -2, 1, 1, -3, 1, -3, -3, -4, -2)) shouldBe -4
  }

  test("test3: Int.MinValue") {
    solve(Array(Int.MinValue)) shouldBe Int.MinValue
  }
}
