package algorithms.easy.basic

import algorithms.easy.basic.RemoveDuplicatesList.{deleteDuplicates => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.{FunSuite, Matchers}

class RemoveDuplicatesListTest extends FunSuite with Matchers with ListNodeTest {

  test("test0: sample input") {
    val input = generateListNodesWithData(Array(1, 1, 2))
    val output = generateListNodesWithData(Array(1, 2))
    sameElement(solve(input), output) shouldBe true
  }

  test("test1: sample input") {
    val input = generateListNodesWithData(Array(1, 1, 2, 3, 3))
    val output = generateListNodesWithData(Array(1, 2, 3))
    sameElement(solve(input), output) shouldBe true
  }

  test("test2: 1, 2, 3") {
    val input = generateListNodesWithData(Array(1, 2, 3))
    val output = generateListNodesWithData(Array(1, 2, 3))
    sameElement(solve(input), output) shouldBe true
  }
}
