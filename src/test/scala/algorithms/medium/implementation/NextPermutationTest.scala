package algorithms.medium.implementation

import algorithms.medium.implementation.NextPermutation.{nextPermutation => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class NextPermutationTest extends AnyFunSuite with Matchers {

  test("test0: sample test") {
    val nums = Array(1, 2, 3)
    solve(nums)
    nums should contain theSameElementsAs Seq(1, 3, 2)
  }

  test("test1: sample test") {
    val nums = Array(3, 2, 1)
    solve(nums)
    nums should contain theSameElementsAs Seq(1, 2, 3)
  }

  test("test2: sample test") {
    val nums = Array(1, 1, 5)
    solve(nums)
    nums should contain theSameElementsAs Seq(1, 5, 1)
  }

}
