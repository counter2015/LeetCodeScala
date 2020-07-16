package algorithms.easy.basic

import algorithms.easy.basic.ValidPalindrome.{isPalindrome => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ValidPalindromeTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("A man, a plan, a canal: Panama") shouldBe true
  }

  test("test1: sample input") {
    solve("race a car") shouldBe false
  }

  test("test2: empty input") {
    solve("") shouldBe true
  }
}
