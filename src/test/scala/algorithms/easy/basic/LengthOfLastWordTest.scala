package algorithms.easy.basic

import algorithms.easy.basic.LengthOfLastWord.{lengthOfLastWord => solve}
import org.scalatest.{FunSuite, Matchers}

class LengthOfLastWordTest extends FunSuite with Matchers {

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
