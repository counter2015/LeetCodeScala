package algorithms.hard.string

import algorithms.hard.string.MinimumWindowSubstring.{minWindow => solve}
import org.scalatest.{FunSuite, Matchers}

class MinimumWindowSubstringTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve("ADOBECODEBANC", "ABC") shouldBe "BANC"
  }

  test("test1: aa, aa") {
    solve("aa", "aa") shouldBe "aa"
  }

  test("test2: a, aa") {
    solve("a", "aa") shouldBe ""
  }

  test("test3: a, b") {
    solve("a", "b") shouldBe ""
  }

  test("test4: a, a") {
    solve("a", "a") shouldBe "a"
  }
}
