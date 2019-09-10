package algorithms.hard.implementation

import algorithms.hard.implementation.FirstMissingPositive.{firstMissingPositive => solve}
import org.scalatest.{FunSuite, Matchers}

class FirstMissingPositiveTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(1, 2, 0)) shouldBe 3
  }

  test("test1: sample input") {
    solve(Array(3, 4, -1, 1)) shouldBe 2
  }

  test("test2:  sample input") {
    solve(Array(7, 8, 9, 11, 12)) shouldBe 1
  }

  test("test3: empty input") {
    solve(Array()) shouldBe 1
  }
}
