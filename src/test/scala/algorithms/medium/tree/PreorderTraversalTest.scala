package algorithms.medium.tree

import algorithms.medium.tree.PreorderTraversal.{preorderTraversal => solve, preorderTraversal2 => solve2}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PreorderTraversalTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(1, "null", 2, "null", "null", 3))
    val res = Seq(1, 2, 3)
    solve(tree) should contain theSameElementsInOrderAs res
    solve2(tree) should contain theSameElementsInOrderAs res
  }

}
