package algorithms.medium.tree

import algorithms.medium.tree.InorderTraversal.{inorderTraversal => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.{FunSuite, Matchers}

class InorderTraversalTest extends FunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {

    val tree = generateTreeNodesWithLevelOrderData(Array(1, "null", 2, "null", "null", 3))
    solve(tree) should contain theSameElementsInOrderAs List(1, 3, 2)
  }
}
