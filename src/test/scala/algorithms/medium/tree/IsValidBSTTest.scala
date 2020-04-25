package algorithms.medium.tree

import algorithms.medium.tree.IsValidBST.{isValidBST => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class IsValidBSTTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(2, 1, 3))
    solve(tree) shouldBe true
  }

  test("test1: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(5, 1, 4, "null", "null", 3, 6))
    solve(tree) shouldBe false
  }
}
