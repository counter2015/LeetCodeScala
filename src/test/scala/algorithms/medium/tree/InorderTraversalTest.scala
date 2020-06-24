package algorithms.medium.tree

import algorithms.medium.tree.InorderTraversal.{inorderTraversal => solve, inorderTraversal2 => solve2}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class InorderTraversalTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {

    val tree = generateTreeNodesWithLevelOrderData(Array(1, "null", 2, "null", "null", 3))
    solve(tree) should contain theSameElementsInOrderAs List(1, 3, 2)
    solve2(tree) should contain theSameElementsInOrderAs List(1, 3, 2)
  }
}
