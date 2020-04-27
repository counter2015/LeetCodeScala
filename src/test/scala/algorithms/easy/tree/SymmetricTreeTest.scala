package algorithms.easy.tree

import algorithms.easy.tree.SymmetricTree.{isSymmetric => solve, isSymmetric2 => solve2}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SymmetricTreeTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(1, 2, 2, 3, 4, 4, 3))
    solve(tree) shouldBe true
    solve2(tree) shouldBe true
  }

  test("test1: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(1, 2, 2, "null", 3, "null", 3))
    solve(tree) shouldBe false
    solve2(tree) shouldBe false
  }

  test("test2: single node") {
    val tree = generateTreeNodesWithLevelOrderData(Array(1))
    solve(tree) shouldBe true
    solve2(tree) shouldBe true
  }
}
