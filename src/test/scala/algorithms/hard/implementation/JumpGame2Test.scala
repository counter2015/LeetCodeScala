package algorithms.hard.implementation

import algorithms.hard.implementation.JumpGame2.{jump => solve}
import org.scalatest.{FunSuite, Matchers}

class JumpGame2Test extends FunSuite with Matchers {

  test("test0: sample test") {
    solve(Array(2, 3, 1, 1, 4)) shouldBe 2
  }

}
