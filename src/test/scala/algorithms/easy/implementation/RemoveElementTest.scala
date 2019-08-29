package algorithms.easy.implementation

import algorithms.easy.implementation.RemoveElement.{removeElement => solve}
import org.scalatest.{FunSuite, Matchers}

class RemoveElementTest extends FunSuite with Matchers {

  test("test0: sample input") {
    val arr = Array(3, 2, 2, 3)
    solve(arr, 3) should be(2)
    arr.take(2) should contain theSameElementsAs Seq(2, 2)
  }

  test("test1: sample input") {
    val arr = Array(0, 1, 2, 2, 3, 0, 4, 2)
    solve(arr, 2) should be(5)
    arr.take(5) should contain theSameElementsAs Seq(0, 1, 3, 0, 4)
  }
}
