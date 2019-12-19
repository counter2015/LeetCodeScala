package algorithms.hard.implementation

import algorithms.hard.implementation.ScrambleString.{isScramble => solve}
import org.scalatest.{FunSuite, Matchers}

class ScrambleStringTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve("great", "rgeat") shouldBe true
  }

  test("test1: sample input") {
    solve("abcde", "caebd") shouldBe false
  }
}
