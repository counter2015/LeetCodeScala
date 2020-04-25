package algorithms.medium.basic

import algorithms.medium.basic.RemoveDuplicatesList2.{deleteDuplicates => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class RemoveDuplicatesList2Test extends AnyFunSuite with Matchers with ListNodeTest {

  test("test0: sample input") {
    val input = generateListNodesWithData(Array(1, 2, 3, 3, 4, 4, 5))
    val output = generateListNodesWithData(Array(1, 2, 5))
    sameElement(solve(input), output) shouldBe true
  }

  test("test1: sample input") {
    val input = generateListNodesWithData(Array(1, 1, 1, 2, 3))
    val output = generateListNodesWithData(Array(2, 3))
    sameElement(solve(input), output) shouldBe true
  }

  test("test3: empty input") {
    val input = generateListNodesWithData(Array())
    val output = generateListNodesWithData(Array())
    sameElement(solve(input), output) shouldBe true
  }

  test("test3: empty result") {
    val input = generateListNodesWithData(Array(2, 2, 3, 3))
    val output = generateListNodesWithData(Array())
    sameElement(solve(input), output) shouldBe true
  }

  test("test4: single input") {
    val input = generateListNodesWithData(Array(1))
    val output = generateListNodesWithData(Array(1))
    sameElement(solve(input), output) shouldBe true
  }

  test("test4: 1 2 2") {
    val input = generateListNodesWithData(Array(1, 2, 2))
    val output = generateListNodesWithData(Array(1))
    sameElement(solve(input), output) shouldBe true
  }
}
