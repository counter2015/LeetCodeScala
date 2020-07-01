package algorithms.hard.string

import algorithms.hard.string.DistinctSubsequences.{numDistinct => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class DistinctSubsequencesTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val s = "rabbbit"
    val t = "rabbit"
    solve(s, t) shouldBe 3
  }

  test("test1: sample input") {
    val s = "babgbag"
    val t = "bag"
    solve(s, t) shouldBe 5
  }
}
