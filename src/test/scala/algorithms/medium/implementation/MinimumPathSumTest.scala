package algorithms.medium.implementation

import algorithms.medium.implementation.MinimumPathSum.{minPathSum => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MinimumPathSumTest extends AnyFunSuite with Matchers {

  test("test0: sample test") {
    val grids = Array(
      Array(1, 3, 1),
      Array(1, 5, 1),
      Array(4, 2, 1)
    )

    solve(grids) shouldBe 7
  }


}
