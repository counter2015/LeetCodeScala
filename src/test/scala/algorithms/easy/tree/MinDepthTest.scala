package algorithms.easy.tree

import algorithms.easy.tree.MinDepth.{minDepth => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MinDepthTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(3, 9, 20, "null", "null", 15, 7))
    solve(tree) shouldBe 2
  }

  test("test0: [1, 2]") {
    val tree = generateTreeNodesWithLevelOrderData(Array(1, 2))
    solve(tree) shouldBe 2
  }
}
