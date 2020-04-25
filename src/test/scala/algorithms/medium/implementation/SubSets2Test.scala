package algorithms.medium.implementation

import algorithms.medium.implementation.SubSets2.{subsetsWithDup => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SubSets2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val input = Array(1, 2, 2)
    val res = List(List(1, 2, 2), List(1, 2), List(1), List(2, 2), List(2), List())
    solve(input) should contain theSameElementsAs res
  }
}
