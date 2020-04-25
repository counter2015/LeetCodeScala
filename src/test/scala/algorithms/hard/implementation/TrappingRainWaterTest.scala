package algorithms.hard.implementation

import algorithms.hard.implementation.TrappingRainWater.{trap => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class TrappingRainWaterTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val heights = Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
    solve(heights) shouldBe 6
  }

  test("test1: 2 0 2") {
    val heights = Array(2, 0, 2)
    solve(heights) shouldBe 2
  }

  test("test2: 5,2,1,2,1,5") {
    val heights = Array(5, 2, 1, 2, 1, 5)
    solve(heights) shouldBe 14
  }
}
