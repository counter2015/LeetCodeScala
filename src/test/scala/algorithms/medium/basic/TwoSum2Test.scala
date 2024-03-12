package algorithms.medium.basic

import algorithms.medium.basic.TwoSum2.{twoSum => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class TwoSum2Test extends AnyFunSuite with Matchers {

  test("test 0: sample input") {
    solve(Array(2,7,11,15), 9) shouldBe Array(1, 2)
  }

  test("test 1: sample input") {
    solve(Array(2, 3, 4), 6) shouldBe Array(1, 3)
  }

  test("test 3: sample input") {
    solve(Array(-1, 0), -1) shouldBe Array(1, 2)
  }

}
