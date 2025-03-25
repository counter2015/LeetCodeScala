package algorithms.medium.tree

import algorithms.medium.tree.FlattenTree.{flatten => solve}
import algorithms.struct.{TreeNode, TreeNodeTest}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class FlattenTreeTest extends AnyFunSuite with Matchers with TreeNodeTest {
  def rightLeanTree(arr: Array[Int]): TreeNode =
    if (arr.nonEmpty) {
      val root = new TreeNode(arr.head)
      root.right = rightLeanTree(arr.tail)
      root
    } else null

  test("test0: sample input") {
    val arr: Array[Either[String, Int]] = Array(1, 2, 5, 3, 4, "null", 6)
    val tree = generateTreeNodesWithLevelOrderData(arr)
    solve(tree)
    val res = rightLeanTree((1 to 6).toArray)
    sameElement(res, tree) shouldBe true
  }

  test("test1: [2,3,4] ") {
    val arr: Array[Either[String, Int]] = Array(2, 3, 4)
    val tree = generateTreeNodesWithLevelOrderData(arr)
    solve(tree)
    val res = rightLeanTree((2 to 4).toArray)
    sameElement(res, tree) shouldBe true
  }
}
