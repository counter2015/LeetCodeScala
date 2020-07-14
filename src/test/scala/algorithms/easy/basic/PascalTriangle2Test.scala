package algorithms.easy.basic

import algorithms.easy.basic.PascalTriangle2.{getRow => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PascalTriangle2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(3) should contain theSameElementsInOrderAs List(1, 3, 3, 1)
  }
}
