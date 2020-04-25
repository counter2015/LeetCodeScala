package algorithms.medium.math

import algorithms.medium.math.UniquePaths.{uniquePaths => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class UniquePathsTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(3, 2) shouldBe 3
  }

  test("test1: sample input") {
    solve(7, 3) shouldBe 28
  }

}
