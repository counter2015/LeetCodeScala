package algorithms.easy.tree

import algorithms.easy.tree.LevelOrderTraversal2.{levelOrderBottom => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class LevelOrderTraversal2Test extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val tree = generateTreeNodesWithLevelOrderData(Array(3, 9, 20, "null", "null", 15, 7))
    val res = List(
      List(15, 7),
      List(9, 20),
      List(3)
    )
    solve(tree) should contain theSameElementsInOrderAs res
  }
}
