package algorithms.hard.implementation

import algorithms.hard.implementation.Candy.{candy => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class CandyTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(1, 0, 2)) shouldBe 5
  }

  test("test1: sample input") {
    solve(Array(1, 2, 2)) shouldBe 4
  }
}
