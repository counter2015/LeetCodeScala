package algorithms.medium.implementation

import algorithms.medium.implementation.MinimumPathSum.{minPathSum => solve}
import org.scalatest.{FunSuite, Matchers}

class MinimumPathSumTest extends FunSuite with Matchers {

  test("test0: sample test") {
    val grids = Array(
      Array(1, 3, 1),
      Array(1, 5, 1),
      Array(4, 2, 1)
    )

    solve(grids) shouldBe 7
  }


}
