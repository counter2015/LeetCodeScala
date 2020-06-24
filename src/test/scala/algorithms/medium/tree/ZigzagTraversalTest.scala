package algorithms.medium.tree

import algorithms.medium.tree.ZigzagTraversal.{zigzagLevelOrder => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ZigzagTraversalTest extends AnyFunSuite with Matchers with TreeNodeTest {
  test("test0: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(3, 9, 20, "null", "null", 15, 7))
    val res = List(
      List(3),
      List(20, 9),
      List(15, 7)
    )
    solve(tree) should contain theSameElementsInOrderAs res
  }

  test("test1: simple test") {
    val tree = generateTreeNodesWithLevelOrderData(Array(3, 9, 20))
    val res = List(
      List(3),
      List(20, 9)
    )
    solve(tree) should contain theSameElementsInOrderAs res
  }

  test("test2: empty input") {
    val tree = generateTreeNodesWithLevelOrderData(Array())
    val res = Nil
    solve(tree) should contain theSameElementsInOrderAs res
  }
}
