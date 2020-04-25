package algorithms.easy.basic

import algorithms.easy.basic.LengthOfLastWord.{lengthOfLastWord => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class LengthOfLastWordTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("Hello World") shouldBe 5
  }

  test("test1: empty string") {
    solve("   ") shouldBe 0
  }

  test("test2: some test") {
    solve("some test") shouldBe 4
  }
}
