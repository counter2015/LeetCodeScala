package algorithms.medium.basic

import algorithms.medium.basic.ReorderList.{reorderList => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ReorderListTest extends AnyFunSuite with Matchers with ListNodeTest {

  test("test0: sample input") {
    val l = generateListNodesWithData(Array(1, 2, 3, 4))
    val res = Seq(1, 4, 2, 3)
    solve(l)
    elements(l) should contain theSameElementsInOrderAs res
  }

  test("test1: sample input") {
    val l = generateListNodesWithData(Array(1, 2, 3, 4, 5))
    val res = Seq(1, 5, 2, 4, 3)
    solve(l)
    elements(l) should contain theSameElementsInOrderAs res
  }
}
