package algorithms.easy.tree

import algorithms.easy.tree.SameTree.{isSameTree => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SameTreeTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val p = generateTreeNodesWithLevelOrderData(Array(1, 2, 3))
    val q = generateTreeNodesWithLevelOrderData(Array(1, 2, 3))
    solve(p, q) shouldBe true
  }

  test("test1: sample input") {
    val p = generateTreeNodesWithLevelOrderData(Array(1, 2))
    val q = generateTreeNodesWithLevelOrderData(Array(1, "null", 2))
    solve(p, q) shouldBe false
  }

  test("test3: sample input") {
    val p = generateTreeNodesWithLevelOrderData(Array(1, 2, 1))
    val q = generateTreeNodesWithLevelOrderData(Array(1, 1, 2))
    solve(p, q) shouldBe false
  }
}
