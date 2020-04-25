package algorithms.medium.search

import algorithms.medium.search.SearchRotatedArray.{search => sovle}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SearchRotatedArrayTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val nums = Array(4, 5, 6, 7, 0, 1, 2)
    val target = 0
    sovle(nums, target) should be(4)
  }

  test("test1: sample input") {
    val nums = Array(4, 5, 6, 7, 0, 1, 2)
    val target = 3
    sovle(nums, target) should be(-1)
  }

  test("test1: [3,1], 1") {
    val nums = Array(3, 1)
    val target = 1
    sovle(nums, target) should be(1)
  }
}
