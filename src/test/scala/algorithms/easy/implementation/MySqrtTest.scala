package algorithms.easy.implementation

import algorithms.easy.implementation.MySqrt.{mySqrt => solve}
import org.scalatest.{FunSuite, Matchers}

class MySqrtTest extends FunSuite with Matchers {

  test("test0: sample test") {
    solve(4) shouldBe 2
  }

  test("test1: sample test") {
    solve(8) shouldBe 2
  }
}
