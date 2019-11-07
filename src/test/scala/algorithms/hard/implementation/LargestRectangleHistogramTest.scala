package algorithms.hard.implementation

import algorithms.hard.implementation.LargestRectangleHistogram.{largestRectangleArea => solve}
import org.scalatest.{FunSuite, Matchers}

class LargestRectangleHistogramTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(2, 1, 5, 6, 2, 3)) shouldBe 10
  }

  test("test1: 2, 1, 2") {
    solve(Array(2, 1, 2)) shouldBe 3
  }

  test("test2: 4, 2, 0, 3, 2, 5") {
    solve(Array(4, 2, 0, 3, 2, 5)) shouldBe 6
  }
}
