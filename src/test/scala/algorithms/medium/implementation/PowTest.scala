package algorithms.medium.implementation

import algorithms.medium.implementation.Pow.{myPow => solve}
import org.scalatest.{FunSuite, Matchers}

class PowTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve(2.0, 10) shouldBe 1024.0
  }

  test("test1: sample input") {
    solve(2.1, 3) shouldBe 9.261
  }

  test("test2: sample input") {
    solve(2.0, -2) shouldBe 0.25
  }
}
