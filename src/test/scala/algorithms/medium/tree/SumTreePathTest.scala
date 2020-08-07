package algorithms.medium.tree

import algorithms.medium.tree.SumTreePath.{sumNumbers => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SumTreePathTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(1, 2, 3))
    solve(tree) shouldBe 25
  }

  test("test1: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(4, 9, 0, 5, 1))
    solve(tree) shouldBe 1026
  }

  test("test2: empyt input") {
    val tree = generateTreeNodesWithLevelOrderData(Array())
    solve(tree) shouldBe 0
  }
}
