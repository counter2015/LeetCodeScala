package algorithms.easy.implementation

import algorithms.easy.implementation.MaximumSubarray.{maxSubArray => solve, maxSubArrayImperative => solve2}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MaximumSubarrayTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) shouldBe 6
    solve2(Array(-2, 1, -3, 4, -1, 2, 1, -5, 4)) shouldBe 6
  }

  test("test1: one element") {
    solve(Array(0)) shouldBe 0
    solve2(Array(0)) shouldBe 0
  }

  test("test2: negative") {
    solve(Array(-200, Int.MinValue, -2, -22)) shouldBe -2
    solve2(Array(-200, Int.MinValue, -2, -22)) shouldBe -2
  }
}
