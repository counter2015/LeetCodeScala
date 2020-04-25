package algorithms.hard.implementation

import algorithms.hard.implementation.JumpGame2.{jump => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class JumpGame2Test extends AnyFunSuite with Matchers {

  test("test0: sample test") {
    solve(Array(2, 3, 1, 1, 4)) shouldBe 2
  }

}
