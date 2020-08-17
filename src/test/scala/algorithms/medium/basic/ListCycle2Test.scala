package algorithms.medium.basic

import algorithms.medium.basic.ListCycle2.{detectCycle => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ListCycle2Test extends AnyFunSuite with Matchers with ListNodeTest {

  test("test0: sample input") {
    val l = generateCycleListNodesWithData(Array(3, 2, 0, -4), 1)
    solve(l) shouldBe l.next
  }

  test("test1: sample input") {
    val l = generateCycleListNodesWithData(Array(1, 2), 0)
    solve(l) shouldBe l
  }

  test("test2: sample input") {
    val l = generateCycleListNodesWithData(Array(1), -1)
    solve(l) shouldBe null
  }
}
