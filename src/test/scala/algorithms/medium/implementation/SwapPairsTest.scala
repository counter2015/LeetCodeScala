package algorithms.medium.implementation

import algorithms.medium.implementation.SwapPairs.{swapPairs => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite

class SwapPairsTest extends AnyFunSuite with ListNodeTest {

  test("test0: sample input") {
    val arr = generateListNodesWithData(Array(1, 2, 3, 4))
    val res = generateListNodesWithData(Array(2, 1, 4, 3))
    assert(sameElement(solve(arr), res))
  }

  test("test1: empty set") {
    val arr = generateListNodesWithData(Array())
    val res = generateListNodesWithData(Array())
    assert(sameElement(solve(arr), res))
  }

  test("test2: [1,2,3,4,5]") {
    val arr = generateListNodesWithData(Array(1, 2, 3, 4, 5))
    val res = generateListNodesWithData(Array(2, 1, 4, 3, 5))
    assert(sameElement(solve(arr), res))
  }

  test("test3: [0]") {
    val arr = generateListNodesWithData(Array(0))
    val res = generateListNodesWithData(Array(0))
    assert(sameElement(solve(arr), res))
  }
}
