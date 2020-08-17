package algorithms.easy.basic

import algorithms.easy.basic.ListCycle.{hasCycle => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ListCycleTest extends AnyFunSuite with Matchers with ListNodeTest {

  test("test0: sample input") {
    val l = generateCycleListNodesWithData(Array(3, 2, 0, -4), 1)
    solve(l) shouldBe true
  }

  test("test1: sample input") {
    val l = generateCycleListNodesWithData(Array(1, 2), 0)
    solve(l) shouldBe true
  }

  test("test2: sample input") {
    val l = generateCycleListNodesWithData(Array(1), -1)
    solve(l) shouldBe false
  }
}
