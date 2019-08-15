package algorithms.medium.basic

import algorithms.medium.basic.ThreeSumClosest.{threeSumClosest => solve}
import org.scalatest.FunSuite

class ThreeSumClosestTest extends FunSuite {

  test("test0: sample input") {
    assert(solve(Array(-1, 2, 1, -4), 1) == 2)
  }

  test("test1: (0, 0, 0), 0") {
    assert(solve(Array(0, 0, 0), 0) == 0)
  }

  test("test2: (1,2,3,4,5) -1") {
    assert(solve(Array(1, 2, 3, 4, 5), -1) == 6)
  }
}
