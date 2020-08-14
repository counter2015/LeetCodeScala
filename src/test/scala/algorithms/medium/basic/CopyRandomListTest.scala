package algorithms.medium.basic

import algorithms.medium.basic.CopyRandomList.{copyRandomList => solve}
import algorithms.struct.{RandomListNode, RandomListNodeTest}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class CopyRandomListTest extends AnyFunSuite with Matchers with RandomListNodeTest {

  test("test0: sample input") {
    val data: List[(Int, Option[Int])] = List((7, None), (13, Some(0)), (11, Some(4)), (10, Some(2)), (1, Some(0)))
    val h = generate(data)
    val nh = solve(h)
    depack(h) should contain theSameElementsInOrderAs depack(nh)
    h.value += 1
    assert(h.value != nh.value, "List should be deep copy")
  }

  test("test1: sample input") {
    val data: List[(Int, Option[Int])] = List((1, Some(1)), (2, Some(1)))
    val h = generate(data)
    val nh = solve(h)
    depack(h) should contain theSameElementsInOrderAs depack(nh)
    h.value += 1
    assert(h.value != nh.value, "List should be deep copy")
  }

  test("test2: sample input") {
    val data: List[(Int, Option[Int])] = List((3, None), (3, Some(0)), (3, None))
    val h = generate(data)
    val nh = solve(h)
    depack(h) should contain theSameElementsInOrderAs depack(nh)
    h.value += 1
    assert(h.value != nh.value, "List should be deep copy")
  }

  test("test3: sample input") {
    var h: RandomListNode = null
    val nh = solve(h)
    depack(h) should contain theSameElementsInOrderAs depack(nh)
    h = new RandomListNode(3)
    assert(nh == null, "List should be deep copy")
  }
}
