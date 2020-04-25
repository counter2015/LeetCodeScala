package algorithms.medium.implementation

import algorithms.medium.implementation.DecodeWay.{numDecodings => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class DecodeWayTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("12") shouldBe 2
  }

  test("test1: sample input") {
    solve("226") shouldBe 3
  }

  test("test2: zero") {
    solve("0") shouldBe 0
  }

  test("test3: 01") {
    solve("01") shouldBe 0
  }

  test("test4: 1010") {
    solve("1010") shouldBe 1
  }
}
