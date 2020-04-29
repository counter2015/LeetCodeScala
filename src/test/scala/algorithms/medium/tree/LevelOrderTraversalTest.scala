package algorithms.medium.tree

import algorithms.medium.tree.LevelOrderTraversal.{levelOrder => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class LevelOrderTraversalTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(3, 9, 20, "null", "null", 15, 7))
    val res = List(
      List(3),
      List(9, 20),
      List(15, 7)
    )
    solve(tree) should contain theSameElementsInOrderAs res
  }
}
