package algorithms.medium.implementation

import algorithms.medium.implementation.SortList.{sortList => solve, sortList2 => solve2}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SortListTest extends AnyFunSuite with Matchers with ListNodeTest {

  test("test0: sample input") {
    val arr = Array(4, 2, 1, 3)
    val l1 = generateListNodesWithData(arr)
    val l2 = generateListNodesWithData(arr)
    val res = Seq(1, 2, 3, 4)
    elements(solve(l1)) should contain theSameElementsInOrderAs res
    elements(solve2(l2)) should contain theSameElementsInOrderAs res
  }

  test("test1: sample input") {
    val arr = Array(-1, 5, 3, 4, 0)
    val l1 = generateListNodesWithData(arr)
    val l2 = generateListNodesWithData(arr)
    val res = Seq(-1, 0, 3, 4, 5)
    elements(solve(l1)) should contain theSameElementsInOrderAs res
    elements(solve(l2)) should contain theSameElementsInOrderAs res
  }

  test("test2: sample input") {
    val arr = Array(4, 19, 14, 5, -3, 1, 8, 5, 11, 15)
    val l1 = generateListNodesWithData(arr)
    val l2 = generateListNodesWithData(arr)
    val res = Seq(-3, 1, 4, 5, 5, 8, 11, 14, 15, 19)
    elements(solve(l1)) should contain theSameElementsInOrderAs res
    elements(solve(l2)) should contain theSameElementsInOrderAs res
  }
}
