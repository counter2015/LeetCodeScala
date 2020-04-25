package algorithms.easy.implementation

import algorithms.easy.implementation.MergeTwoLists.{mergeTwoLists => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite

class MergeTwoListsTest extends AnyFunSuite with ListNodeTest {

  test("test0: sample input") {
    val a = generateListNodesWithData(Array(1, 2, 4))
    val b = generateListNodesWithData(Array(1, 3, 4))
    val c = generateListNodesWithData(Array(1, 1, 2, 3, 4, 4))
    assert(sameElement(solve(a, b), c))
  }

  test("test1: empty input") {
    assert(sameElement(solve(null, null), null))
  }
}
