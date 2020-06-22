package algorithms.easy.tree

import algorithms.easy.tree.ArrayToBST.{sortedArrayToBST => solve}
import algorithms.struct.TreeNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ArrayToBSTTest extends AnyFunSuite with Matchers with TreeNodeTest {

  test("test0: sample input") {
    val arr = Array(-10, -3, 0, 5, 9)
    val res = solve(arr)
    assert(isBalanced(res) && isSored(res))
  }
}
