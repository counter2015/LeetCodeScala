package algorithms.medium.basic

import algorithms.medium.basic.ThreeSum.{threeSum => solve}
import org.scalatest.FunSuite

class ThreeSumTest extends FunSuite {

  test("test0: sample input") {
    assert(solve(Array(-1, 0, 1, 2, -1, -4)).toSet == List(List(-1, 0, 1), List(-1, -1, 2)).toSet)
  }

  test("test1: -1, 0, 1, 2, -2, -4") {
    assert(solve(Array(-1, 0, 1, 2, -2, -4)).toSet == List(List(-1, 0, 1), List(-2, 0, 2)).toSet)
  }

  test("test2: zero") {
    assert(solve(Array(0, 0, 0, 0, 0, 0)).toSet == List(List(0, 0, 0)).toSet)
  }
}
