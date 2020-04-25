package algorithms.easy.implementation

import algorithms.easy.implementation.ClimbingStairs.{climbStairs => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ClimbingStairsTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(2) shouldBe 2
  }

  test("test1: sample input") {
    solve(3) shouldBe 3
  }

}
