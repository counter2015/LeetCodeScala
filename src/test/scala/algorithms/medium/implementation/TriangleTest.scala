package algorithms.medium.implementation

import algorithms.medium.implementation.Triangle.{minimumTotal => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class TriangleTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val triangle = List(
      List(2),
      List(3, 4),
      List(6, 5, 7),
      List(4, 1, 8, 3)
    )
    solve(triangle) shouldBe 11
  }

}
