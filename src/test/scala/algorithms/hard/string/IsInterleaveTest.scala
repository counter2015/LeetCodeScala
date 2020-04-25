package algorithms.hard.string

import algorithms.hard.string.IsInterleave.{isInterleave => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class IsInterleaveTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("aabcc", "dbbca", "aadbbcbcac") shouldBe true
  }

  test("test1: sample input") {
    solve("aabcc", "dbbca", "aadbbbaccc") shouldBe false
  }
}
