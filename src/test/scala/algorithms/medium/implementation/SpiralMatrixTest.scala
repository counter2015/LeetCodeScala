package algorithms.medium.implementation

import algorithms.medium.implementation.SpiralMatrix.{spiralOrder => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SpiralMatrixTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val input = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))

    val res = Array(1, 2, 3, 6, 9, 8, 7, 4, 5)

    solve(input) shouldBe res
  }

  test("test1: sample input") {
    val input = Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8), Array(9, 10, 11, 12))

    val res = Array(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7)
    solve(input) shouldBe res
  }
}
