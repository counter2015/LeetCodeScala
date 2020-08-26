package algorithms.medium.search

import algorithms.medium.search.MinRotatedArray.{findMin => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MinRotatedArrayTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val arr = Array(3, 4, 5, 1, 2)
    solve(arr) shouldBe 1
  }

  test("test1: sample input") {
    val arr = Array(4, 5, 6, 7, 0, 1, 2)
    solve(arr) shouldBe 0
  }

  test("test2: no rotated") {
    val arr = Array(1, 2, 3, 4, 5)
    solve(arr) shouldBe 1
  }
}
