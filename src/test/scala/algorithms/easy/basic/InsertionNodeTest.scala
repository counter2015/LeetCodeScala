package algorithms.easy.basic

import algorithms.easy.basic.InsertionNode.{getIntersectionNode => solve}
import algorithms.struct.{ListNode, ListNodeTest}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class InsertionNodeTest extends AnyFunSuite with Matchers with ListNodeTest {

  test("test0: sample input") {
    val l1 = generateListNodesWithData(Array(4, 1, 8, 4, 5))
    val l2 = generateListNodesWithData(Array(5, 6, 1))
    l2.next.next.next = l1.next.next
    solve(l1, l2) shouldBe l1.next.next
  }

  test("test1: sample input") {
    val l1 = generateListNodesWithData(Array(1, 9, 1, 2, 4))
    val l2 = new ListNode(3)
    l2.next = l1.next.next.next
    solve(l1, l2) shouldBe l2.next
  }

  test("test2: sample input") {
    val l1 = generateListNodesWithData(Array(2, 6, 4))
    val l2 = generateListNodesWithData(Array(1, 5))
    solve(l1, l2) shouldBe null
  }
}
