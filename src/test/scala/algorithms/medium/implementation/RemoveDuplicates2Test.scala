package algorithms.medium.implementation

import algorithms.medium.implementation.RemoveDuplicates2.{removeDuplicates => solve}
import org.scalatest.{FunSuite, Matchers}

class RemoveDuplicates2Test extends FunSuite with Matchers {

  test("test0: sample input") {
    val arr = Array(1, 1, 1, 2, 2, 3)
    val len = solve(arr)
    val res = Array(1, 1, 2, 2, 3)
    arr.take(len) should contain theSameElementsInOrderAs res
  }

  test("test1: sample input") {
    val arr = Array(0, 0, 1, 1, 1, 1, 2, 3, 3)
    val len = solve(arr)
    val res = Array(0, 0, 1, 1, 2, 3, 3)
    arr.take(len) should contain theSameElementsInOrderAs res
  }
}
