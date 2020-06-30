package algorithms.medium.tree

import algorithms.medium.tree.PathSum2.{pathSum => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PathSum2Test extends AnyFunSuite with Matchers with TreeNodeTest {
  test("test0: sample input") {
    val arr: Array[Either[String, Int]] = Array(
      5,
      4, 8,
      11, "null", 13, 4,
      7, 2, "null", "null", "null", "null", 5, 1)
    val tree = generateTreeNodesWithLevelOrderData(arr)
    val res = List(
      List(5, 4, 11, 2),
      List(5, 8, 4, 5)
    )
    val ans = solve(tree, 22)
    ans should contain theSameElementsAs res
    for (i <- ans.indices) {
      ans(i) should contain theSameElementsInOrderAs res(i)
    }
  }
}
