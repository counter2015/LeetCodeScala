package algorithms.hard.implementation


import algorithms.hard.implementation.ReverseKGroup.{reverseKGroup => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.FunSuite

class ReverseKGroupTest extends FunSuite with ListNodeTest {

  test("test0: sample input") {
    val arr = generateListNodesWithData(Array(1, 2, 3, 4, 5))
    val res = generateListNodesWithData(Array(2, 1, 4, 3, 5))
    assert(sameElement(solve(arr, 2), res))
  }

  test("test1: sample input") {
    val arr = generateListNodesWithData(Array(1, 2, 3, 4, 5))
    val res = generateListNodesWithData(Array(3, 2, 1, 4, 5))
    assert(sameElement(solve(arr, 3), res))
  }

  test("test2: k = 1, [2,3,4,5,6]") {
    val arr = generateListNodesWithData(Array(2, 3, 4, 5, 6))
    val res = generateListNodesWithData(Array(2, 3, 4, 5, 6))
    assert(sameElement(solve(arr, 1), res))
  }

  test("test3: k = 3, empty ListNode") {
    val arr = generateListNodesWithData(Array())
    val res = generateListNodesWithData(Array())
    assert(sameElement(solve(arr, 3), res))
  }


}

