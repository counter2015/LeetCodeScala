package algorithms.easy.tree

import algorithms.easy.tree.MaxDepth.{maxDepth => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MaxDepthTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(3, 9, 20, "null", "null", 15, 7))
    solve(tree) shouldBe 3
  }
}
