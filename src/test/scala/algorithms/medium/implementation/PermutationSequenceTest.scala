package algorithms.medium.implementation

import algorithms.medium.implementation.PermutationSequence.{getPermutation => solve}
import org.scalatest.{FunSuite, Matchers}

class PermutationSequenceTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve(3, 3) shouldBe "213"
  }

  test("test1: sample input") {
    solve(4, 9) shouldBe "2314"
  }

  test("test2: 4321") {
    solve(4, 24) shouldBe "4321"
  }

}
