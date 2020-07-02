package algorithms.easy.basic

import algorithms.easy.basic.PascalTriangle.{generate => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PascalTriangleTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val res = solve(5)
    val ans = List(
      List(1),
      List(1, 1),
      List(1, 2, 1),
      List(1, 3, 3, 1),
      List(1, 4, 6, 4, 1)
    )
    res should contain theSameElementsAs ans
  }
}
