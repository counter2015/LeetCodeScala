package algorithms.medium.tree

import algorithms.medium.tree.PreInOrderBuild.{buildTree => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PreInOrderBuildTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val preorder = Array(3, 9, 20, 15, 7)
    val inorder = Array(9, 3, 15, 20, 7)
    val res = generateTreeNodesWithLevelOrderData(Array(3, 9, 20, "null", "null", 15, 7))
    assert(sameElement(solve(preorder, inorder), res))
  }
}
