package algorithms.medium.basic

import algorithms.medium.basic.FourSum.{fourSum => solve}
import org.scalatest.funsuite.AnyFunSuite

class FourSumTest extends AnyFunSuite {

  test("test0: sample input") {
    assert(
      solve(Array(1, 0, -1, 0, -2, 2), 0).toSet == List(List(-2, -1, 1, 2), List(-2, 0, 0, 2), List(-1, 0, 0, 1)).toSet
    )
  }

  test("test1: zero") {
    assert(solve(Array(0, 0, 0, 0, 0, 0), 0).toSet == List(List(0, 0, 0, 0)).toSet)
  }
}
