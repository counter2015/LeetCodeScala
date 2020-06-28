package algorithms.easy.tree

import algorithms.easy.tree.PathSum.{hasPathSum => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PathSumTest extends AnyFunSuite with Matchers with TreeNodeTest {
  test("test0: sample input") {
    val arr: Array[Either[String, Int]] = Array(5, 4, 8, 11, 13, 4, 7, 2, "null", 1)
    val tree = generateTreeNodesWithLevelOrderData(arr)
    solve(tree, 22) shouldBe true
  }

  test("test1: sample input with not exist sum value") {
    val arr: Array[Either[String, Int]] = Array(5, 4, 8, 11, 13, 4, 7, 2, "null", 1)
    val tree = generateTreeNodesWithLevelOrderData(arr)
    solve(tree, 0) shouldBe false
  }
}
