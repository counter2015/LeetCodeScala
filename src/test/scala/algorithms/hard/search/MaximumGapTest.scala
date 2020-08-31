package algorithms.hard.search

import algorithms.hard.search.MaximumGap.{maximumGap => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MaximumGapTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val arr = Array(3, 6, 9, 1)
    solve(arr) shouldBe 3
  }

  test("test1: sample input") {
    val arr = Array(10)
    solve(arr) shouldBe 0
  }

  test("test2: empty input") {
    val arr: Array[Int] = Array()
    solve(arr) shouldBe 0
  }

  test("test3: edge case") {
    val arr: Array[Int] = Array(Int.MaxValue, Int.MaxValue, 0)
    solve(arr) shouldBe Int.MaxValue
  }
}
