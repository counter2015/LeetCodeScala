package algorithms.medium.implementation

import algorithms.medium.implementation.RemoveNthFromEnd.{removeNthFromEnd => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite

class RemoveNthFromEndTest extends AnyFunSuite with ListNodeTest {

  test("test0: sample input") {
    val arr = generateListNodesWithData(Array(1, 2, 3, 4, 5))
    val res = generateListNodesWithData(Array(1, 2, 3, 5))

    assert(sameElement(solve(arr, 2), res))
  }

  test("test1: one element") {
    val arr = generateListNodesWithData(Array(1))
    assert(sameElement(solve(arr, 1), null))
  }

  test("test2: 1, 2, remove first element") {
    val arr = generateListNodesWithData(Array(1, 2))
    val res = generateListNodesWithData(Array(2))
    assert(sameElement(solve(arr, 2), res))
  }
}
