package algorithms.medium.implementation

import algorithms.medium.implementation.AddTwoNumbers.{addTwoNumbers => solve}
import algorithms.struct.ListNode
import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

class AddTwoNumbersTest extends FunSuite {
  def build(xs: Array[Int]): ListNode = {
    var res = new ListNode(0)
    var head = res
    for (x <- xs) {
      head.next = new ListNode(x)
      head = head.next
    }
    res.next
  }

  def get(l: ListNode): Array[Int] = {
    val xs = ArrayBuffer.empty[Int]
    var node = l
    while (node != null) {
      xs += node.x
      node = node.next
    }
    xs.toArray
  }

  test("test0: sample input") {
    val l1 = build(Array(2, 4, 3))
    val l2 = build(Array(5, 6, 4))
    val res = Array(7, 0, 8)
    assert(
      get(solve(l1, l2)).zip(res).forall(x => x._1 == x._2)
    )
  }

  test("test1: zero input") {
    val l1 = build(Array(0))
    val l2 = build(Array(0))
    val res = Array(0)
    assert(
      get(solve(l1, l2)).zip(res).forall(x => x._1 == x._2)
    )
  }

  test("test2: add with carry with big element") {
    val l1 = build(Array(1))
    val l2 = build(Array.fill(100)(9))
    val res = Array.fill(101)(0)
    res(100) = 1
    assert(
      get(solve(l1, l2)).zip(res).forall(x => x._1 == x._2)
    )
  }

  test("test3: add with carry for multi position carry") {
    val l1 = build(Array(1, 3, 5, 2, 9))
    val l2 = build(Array(9, 0, 5, 7))
    val res = Array(0, 4, 0, 0, 0, 1)
    assert(
      get(solve(l1, l2)).zip(res).forall(x => x._1 == x._2)
    )
  }
}
