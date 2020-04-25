package algorithms.hard.tree

import algorithms.hard.tree.RecoverTree.{recoverTree => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class RecoverTreeTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(1, 3, "null", "null", 2))
    val res = generateTreeNodesWithLevelOrderData(Array(3, 1, "null", "null", 2))
    solve(tree)
    sameElement(tree, res)
    Iterator
  }

  test("test1: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(3, 1, 4, "null", "null", 2))
    val res = generateTreeNodesWithLevelOrderData(Array(2, 1, 4, "null", "null", 3))
    solve(tree)
    sameElement(tree, res)
  }
}
