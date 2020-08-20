package algorithms.medium.implementation

import algorithms.medium.implementation.InsertionSortList.{insertionSortList => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class InsertionSortListTest extends AnyFunSuite with Matchers with ListNodeTest {

  test("test0: sample input") {
    val l = generateListNodesWithData(Array(4, 2, 1, 3))
    val res = Seq(1, 2, 3, 4)
    elements(solve(l)) should contain theSameElementsInOrderAs res
  }

  test("test1: sample input") {
    val l = generateListNodesWithData(Array(-1, 5, 3, 4, 0))
    val res = Seq(-1, 0, 3, 4, 5)
    elements(solve(l)) should contain theSameElementsInOrderAs res
  }
}
