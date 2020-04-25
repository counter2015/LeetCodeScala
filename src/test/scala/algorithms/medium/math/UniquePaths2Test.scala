package algorithms.medium.math

import algorithms.medium.math.UniquePaths2.{uniquePathsWithObstacles => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class UniquePaths2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val grids = Array(
      Array(0, 0, 0),
      Array(0, 1, 0),
      Array(0, 0, 0)
    )

    solve(grids) shouldBe 2
  }

  test("test1: single element 1") {
    val grids = Array(Array(1))
    solve(grids) shouldBe 0
  }

  test("test2: two element 1,0") {
    val grids = Array(Array(1, 0))
    solve(grids) shouldBe 0
  }
}
