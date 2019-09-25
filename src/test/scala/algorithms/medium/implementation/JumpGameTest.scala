package algorithms.medium.implementation

import algorithms.medium.implementation.JumpGame.{canJump => solve}
import org.scalatest.{FunSuite, Matchers}

class JumpGameTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve(Array(2, 3, 1, 1, 4)) shouldBe true
  }

  test("test1: sample input") {
    solve(Array(3, 2, 1, 0, 4)) shouldBe true
  }
}
