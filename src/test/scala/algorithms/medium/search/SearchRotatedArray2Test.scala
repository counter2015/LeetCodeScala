package algorithms.medium.search

import algorithms.medium.search.SearchRotatedArray2.{search => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SearchRotatedArray2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val nums = Array(2, 5, 6, 0, 0, 1, 2)
    val target = 0
    solve(nums, target) shouldBe true
  }

  test("test1: sample input") {
    val nums = Array(2, 5, 6, 0, 0, 1, 2)
    val target = 3
    solve(nums, target) shouldBe false
  }

  test("test2: [1, 3, 1, 1, 1], 3") {
    val nums = Array(1, 3, 1, 1, 1)
    val target = 3
    solve(nums, target) shouldBe true
  }
}
