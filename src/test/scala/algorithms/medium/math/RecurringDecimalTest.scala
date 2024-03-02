package algorithms.medium.math

import algorithms.medium.math.RecurringDecimal.{fractionToDecimal => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class RecurringDecimalTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(1, 2) shouldBe "0.5"
  }

  test("test1: sample input") {
    solve(2, 1) shouldBe "2"
  }

  test("test2: sample input") {
    solve(4, 333) shouldBe "0.(012)"
  }

  test("test3: zero input") {
    solve(0, -123) shouldBe "0"
  }

  test("test4: normal input") {
    solve(1, 7) shouldBe "0.(142857)"
  }

  test("test5: negative integer input") {
    solve(-8, 7) shouldBe "-1.(142857)"
  }

  test("test6: negative integer input") {
    solve(1, 333) shouldBe "0.(003)"
  }

  test("test7: 1 / 6") {
    solve(1, 6) shouldBe "0.1(6)"
  }

  test("test8: 7 / -12") {
    solve(7, -12) shouldBe "-0.58(3)"
  }
}
