package algorithms.easy.basic

import algorithms.easy.basic.TwoSum.{twoSum => solve}
import org.scalatest.FunSuite

class TwoSumTest extends FunSuite {

  test("test0: sample input") {
    val nums = Array(2, 7, 11, 15)
    val target = 9
    assert(solve(nums, target).toSet == Set(0, 1))
  }

  test("test1: unordered Array") {
    val nums = Array(11, 7, 2, 15)
    val target = 9
    assert(solve(nums, target).toSet == Set(1, 2))
  }

  test("test2: negative Array input") {
    val nums = Array(-22, 22, -24, 25)
    val target = 1
    assert(solve(nums, target).toSet == Set(2, 3))
  }

  test("test3: two element Array") {
    val nums = Array(2, 2)
    val target = 4
    assert(solve(nums, target).toSet == Set(0, 1))
  }

  test("test4: big element Array") {
    val nums = Array(Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE - 1, Integer.MIN_VALUE + 42)
    val target = -1
    assert(solve(nums, target).toSet == Set(0, 1))
  }
}
