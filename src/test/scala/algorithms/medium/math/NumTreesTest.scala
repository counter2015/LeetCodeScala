package algorithms.medium.math

import algorithms.medium.math.NumTrees.{numTrees => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class NumTreesTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(3) shouldBe 5
  }

  test("test1: 17") {
    solve(19) shouldBe 1767263190
  }
}
