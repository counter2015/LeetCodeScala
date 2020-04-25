package algorithms.medium.implementation

import algorithms.medium.implementation.Permutations2.{permuteUnique => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class Permutations2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(1, 1, 2)) should contain theSameElementsAs List(List(1, 1, 2), List(1, 2, 1), List(2, 1, 1))
  }
}
