package algorithms.easy.tree

import algorithms.easy.tree.BalancedTree.{isBalanced => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class BalancedTreeTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val arr: Array[Either[String, Int]] = Array(3, 9, 20, "null", "null", 15, 7)
    val tree = generateTreeNodesWithLevelOrderData(arr)
    solve(tree) shouldBe true
  }

  test("test1: sample input") {
    val arr: Array[Either[String, Int]] = Array(1, 2, 2, 3, 3, "null", "null", 4, 4)
    val tree = generateTreeNodesWithLevelOrderData(arr)
    solve(tree) shouldBe false
  }
}
