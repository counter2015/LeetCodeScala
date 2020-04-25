package algorithms.medium.implementation

import algorithms.medium.implementation.RotateList.{rotateRight => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class RotateListTest extends AnyFunSuite with Matchers with ListNodeTest {

  test("test0: sample input") {
    val arr = generateListNodesWithData(Array(1, 2, 3, 4, 5))
    sameElement(solve(arr, 2), generateListNodesWithData(Array(4, 5, 1, 2, 3))) shouldBe true
  }

  test("test1: sample input") {
    val arr = generateListNodesWithData(Array(0, 1, 2))
    sameElement(solve(arr, 4), generateListNodesWithData(Array(2, 0, 1))) shouldBe true
  }

}
