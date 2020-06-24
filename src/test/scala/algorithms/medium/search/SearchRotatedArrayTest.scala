package algorithms.medium.search

import algorithms.medium.search.SearchRotatedArray.{search => solve, searchWTF => solve2}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SearchRotatedArrayTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val nums = Array(4, 5, 6, 7, 0, 1, 2)
    val target = 0
    solve(nums, target) should be(4)
    solve2(nums, target) should be(4)
  }

  test("test1: sample input") {
    val nums = Array(4, 5, 6, 7, 0, 1, 2)
    val target = 3
    solve(nums, target) should be(-1)
    solve2(nums, target) should be(-1)
  }

  test("test2: [3,1], 1") {
    val nums = Array(3, 1)
    val target = 1
    solve(nums, target) should be(1)
    solve2(nums, target) should be(1)
  }

  test("test3: empty input") {
    val nums: Array[Int] = Array()
    val target = 1
    solve(nums, target) should be(-1)
    solve2(nums, target) should be(-1)
  }

  test("test4: [4, 3, 2, 1, 5, 7, 8]") {
    val nums: Array[Int] = Array(4, 3, 2, 1, 5, 7, 8)
    val target = 7
    solve(nums, target) should be(5)
    solve2(nums, target) should be(5)
  }
}
