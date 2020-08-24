package algorithms.medium.string

import algorithms.medium.string.ReverseWords.{reverseWords => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ReverseWordsTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("the sky is blue") shouldBe "blue is sky the"
  }

  test("test1: sample input") {
    solve("  hello world!  ") shouldBe "world! hello"
  }

  test("test2: sample input") {
    solve("a good   example") shouldBe "example good a"
  }
}
