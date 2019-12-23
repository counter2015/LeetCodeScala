package algorithms.medium.implementation

import algorithms.medium.implementation.SubSets2.{subsetsWithDup => solve}
import org.scalatest.{FunSuite, Matchers}

class SubSets2Test extends FunSuite with Matchers {

  test("test0: sample input") {
    val input = Array(1, 2, 2)
    val res = List(List(1, 2, 2), List(1, 2), List(1), List(2, 2), List(2), List())
    solve(input) should contain theSameElementsAs res
  }
}
