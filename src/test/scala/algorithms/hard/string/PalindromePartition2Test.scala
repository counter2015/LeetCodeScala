package algorithms.hard.string

import algorithms.hard.string.PalindromePartition2.{minCut => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PalindromePartition2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("aab") shouldBe 1
  }
}
