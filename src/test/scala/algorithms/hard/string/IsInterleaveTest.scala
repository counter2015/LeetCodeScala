package algorithms.hard.string

import algorithms.hard.string.IsInterleave.{isInterleave => solve, isInterleaveF => solve2}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class IsInterleaveTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("aabcc", "dbbca", "aadbbcbcac") shouldBe true
    solve2("aabcc", "dbbca", "aadbbcbcac") shouldBe true
  }

  test("test1: sample input") {
    solve("aabcc", "dbbca", "aadbbbaccc") shouldBe false
    solve2("aabcc", "dbbca", "aadbbbaccc") shouldBe false
  }
}
