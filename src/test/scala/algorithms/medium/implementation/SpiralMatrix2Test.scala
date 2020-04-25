package algorithms.medium.implementation

import algorithms.medium.implementation.SpiralMatrix2.{generateMatrix => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SpiralMatrix2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val res = Array(
      Array(1, 2, 3),
      Array(8, 9, 4),
      Array(7, 6, 5)
    )

    solve(3) shouldBe res
  }
}
