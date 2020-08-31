package algorithms.medium.search

import algorithms.medium.search.FindPeakElement.{findPeakElement => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FindPeakElementTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val nums = Array(1, 2, 3, 1)
    solve(nums) shouldBe 2
  }

  test("test1: sample input") {
    val nums = Array(1, 2, 1, 3, 5, 6, 4)
    Seq(1, 5) should contain(solve(nums))
  }

  test("test2: custom input") {
    val nums = Array(1, 2, 1, 3, 5, 7, 9)
    Seq(1, 6) should contain(solve(nums))
  }

  test("test3: one element") {
    val nums = Array(1)
    solve(nums) shouldBe 0
  }
}
