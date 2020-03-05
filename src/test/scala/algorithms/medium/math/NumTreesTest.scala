package algorithms.medium.math

import algorithms.medium.math.NumTrees.{numTrees => solve}
import org.scalatest.{FunSuite, Matchers}

class NumTreesTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve(3) shouldBe 5
  }

  test("test1: 17") {
    solve(19) shouldBe 1767263190
  }
}
