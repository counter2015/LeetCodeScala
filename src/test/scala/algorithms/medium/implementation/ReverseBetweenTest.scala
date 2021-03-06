package algorithms.medium.implementation

import algorithms.medium.implementation.ReverseBetween.{reverseBetween => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ReverseBetweenTest extends AnyFunSuite with Matchers with ListNodeTest {

  test("test0: sample input") {
    val arr = generateListNodesWithData(Array(1, 2, 3, 4, 5))
    val res = generateListNodesWithData(Array(1, 4, 3, 2, 5))
    sameElement(solve(arr, 2, 4), res) shouldBe true
  }
}
