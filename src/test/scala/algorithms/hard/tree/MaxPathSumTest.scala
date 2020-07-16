package algorithms.hard.tree

import algorithms.hard.tree.MaxPathSum.{maxPathSum => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MaxPathSumTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val arr: Array[Either[String, Int]] = Array(1, 2, 3)
    val tree = generateTreeNodesWithLevelOrderData(arr)
    solve(tree) shouldBe 6
  }

  test("test1: sample input") {
    val arr: Array[Either[String, Int]] = Array(-10, 9, 20, "null", "null", 15, 7)
    val tree = generateTreeNodesWithLevelOrderData(arr)
    solve(tree) shouldBe 42
  }
}
