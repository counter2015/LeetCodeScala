package algorithms.hard.implementation

import algorithms.hard.implementation.LongestConsecutive.{longestConsecutive => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class LongestConsecutiveTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(100, 4, 200, 1, 3, 2)) shouldBe 4
  }
}
