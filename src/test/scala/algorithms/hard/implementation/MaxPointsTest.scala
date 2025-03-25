package algorithms.hard.implementation

import algorithms.hard.implementation.MaxPoints.{maxPoints => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MaxPointsTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val arr = Array(Array(1, 1), Array(2, 2), Array(3, 3))
    solve(arr) shouldBe 3
  }

  test("test1: sample input") {
    val arr = Array(Array(1, 1), Array(3, 2), Array(5, 3), Array(4, 1), Array(2, 3), Array(1, 4))
    solve(arr) shouldBe 4
  }

  test("test2: single point") {
    val arr = Array(Array(1, 1))
    solve(arr) shouldBe 1
  }

  test("test3: a triangle lie on axis x, which may lead int overflow") {
    val arr = Array(
      Array(0, 0),
      Array(1, 65536),
      Array(65536, 0)
    )
    solve(arr) shouldBe 2
  }
}
