package algorithms.medium.tree

import algorithms.medium.tree.ListToBST.{sortedListToBST => solve}
import algorithms.struct.{ListNodeTest, TreeNodeTest}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ListToBSTTest extends AnyFunSuite with Matchers with TreeNodeTest with ListNodeTest {

  test("test0: sample input") {
    val arr = generateListNodesWithData(Array(-10, -3, 0, 5, 9))
    val res = solve(arr)
    assert(isBalanced(res) && isSored(res))
  }
}
