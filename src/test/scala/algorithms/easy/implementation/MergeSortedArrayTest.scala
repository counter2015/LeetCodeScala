package algorithms.easy.implementation

import algorithms.easy.implementation.MergeSortedArray.{merge => solve}
import org.scalatest.{FunSuite, Matchers}

class MergeSortedArrayTest extends FunSuite with Matchers {

  test("test0: sample input") {
    val arr1 = Array(1, 2, 3, 0, 0, 0)
    val arr2 = Array(2, 5, 6)
    val res = Array(1, 2, 2, 3, 5, 6)
    val m = 3
    val n = 3
    solve(arr1, m, arr2, n)
    arr1 should contain theSameElementsInOrderAs res
  }
}
