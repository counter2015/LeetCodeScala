package algorithms.medium.basic

import algorithms.medium.basic.MostWaterContainer.{maxArea => solve}
import org.scalatest.funsuite.AnyFunSuite

class MostWaterContainerTest extends AnyFunSuite {

  test("test0: sample test") {
    assert(solve(Array(1, 8, 6, 2, 5, 4, 8, 3, 7)) == 49)
  }

  test("test1: same element") {
    assert(solve(Array(2, 2, 2, 2, 2)) == 8)
  }

  test("test2: ordered number") {
    assert(solve(Array(1, 2, 3, 4, 5)) == 6)
  }
}
