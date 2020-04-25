package algorithms.medium.implementation

import algorithms.medium.implementation.JumpGame.{canJump => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class JumpGameTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(2, 3, 1, 1, 4)) shouldBe true
  }

  test("test1: sample input") {
    solve(Array(3, 2, 1, 0, 4)) shouldBe false
  }
}
