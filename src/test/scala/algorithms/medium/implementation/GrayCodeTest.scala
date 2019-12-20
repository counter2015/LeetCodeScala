package algorithms.medium.implementation

import algorithms.medium.implementation.GrayCode.{grayCode => solve}
import org.scalatest.{FunSuite, Matchers}

class GrayCodeTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve(0) should contain theSameElementsInOrderAs List(0)
  }

  test("test1: sample input") {
    solve(2) should contain theSameElementsInOrderAs List(0, 1, 3, 2)
  }
}
