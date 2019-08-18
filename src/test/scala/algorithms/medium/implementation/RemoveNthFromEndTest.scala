package algorithms.medium.implementation

import algorithms.medium.implementation.RemoveNthFromEnd.{removeNthFromEnd => solve}
import algorithms.struct.ListNode
import org.scalatest.FunSuite

class RemoveNthFromEndTest extends FunSuite {

  def generateListNodesWithData(arr: Array[Int]): ListNode = {
    val l = arr.map(new ListNode(_))
    for (i <- 1 until arr.length)
      l(i - 1).next = l(i)

    l.head
  }

  def sameElement(a: ListNode, b: ListNode): Boolean = {
    if (a == null && b == null) true
    else if (a != null && b != null) {
      a.x == b.x && sameElement(a.next, b.next)
    } else false
  }

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
