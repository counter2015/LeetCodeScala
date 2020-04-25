package algorithms.medium.string

import algorithms.medium.string.MultiplyStrings.{multiply => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MultiplyStringsTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val str1 = "2"
    val str2 = "3"
    solve(str1, str2) shouldBe "6"
  }

  test("test1: sample input") {
    val str1 = "123"
    val str2 = "456"
    solve(str1, str2) shouldBe "56088"
  }

  test("test2: 0") {
    val str1 = "0"
    val str2 = "123456789" * 10
    solve(str1, str2) shouldBe "0"
  }
}
