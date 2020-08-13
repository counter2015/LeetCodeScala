package algorithms.medium.implementation

import algorithms.medium.implementation.GasStation.{canCompleteCircuit => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class GasStationTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val gs = Array(1, 2, 3, 4, 5)
    val cs = Array(3, 4, 5, 1, 2)
    solve(gs, cs) shouldBe 3
  }

  test("test1: sample input") {
    val gs = Array(2, 3, 4)
    val cs = Array(3, 4, 3)
    solve(gs, cs) shouldBe -1
  }

  test("test1: single station") {
    val gs = Array(2)
    val cs = Array(2)
    solve(gs, cs) shouldBe 0
  }
}
