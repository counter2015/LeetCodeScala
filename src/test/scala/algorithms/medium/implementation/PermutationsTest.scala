package algorithms.medium.implementation

import algorithms.medium.implementation.Permutations.{permute => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PermutationsTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val res = Seq(
      Seq(1, 2, 3),
      Seq(1, 3, 2),
      Seq(2, 1, 3),
      Seq(2, 3, 1),
      Seq(3, 1, 2),
      Seq(3, 2, 1)
    )
    solve(Array(1, 2, 3)) should contain theSameElementsAs res
  }
}
