package algorithms.hard.search

import algorithms.hard.search.MinRotatedArray2.{findMin => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MinRotatedArray2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val arr = Array(1, 3, 5)
    solve(arr) shouldBe 1
  }

  test("test1: sample input") {
    val arr = Array(2, 2, 2, 0, 1)
    solve(arr) shouldBe 0
  }

  test("test2: 2 0 2 2 2") {
    val arr = Array(2, 0, 2, 2, 2)
    solve(arr) shouldBe 0
  }

  test("test2: same element") {
    val arr = Array(2, 2, 2, 2, 2)
    solve(arr) shouldBe 2
  }
}
