package algorithms.medium.implementation

import algorithms.medium.implementation.PartitionList.{partition => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.{FunSuite, Matchers}

class PartitionListTest extends FunSuite with Matchers with ListNodeTest {

  test("test 0: sample input") {
    val input = generateListNodesWithData(Array(1, 4, 3, 2, 5, 2))
    val res = generateListNodesWithData(Array(1, 2, 2, 4, 3, 5))
    sameElement(solve(input, 3), res) shouldBe true
  }
}
