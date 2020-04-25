package algorithms.medium.search

import algorithms.medium.search.SearchRange.{searchRange => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SearchRangeTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val arr = Array(5, 7, 7, 8, 8, 10)
    solve(arr, 8) should be(Seq(3, 4))
  }

  test("test1: sample input") {
    val arr = Array(5, 7, 7, 8, 8, 10)
    solve(arr, 6) should be(Seq(-1, -1))
  }

  test("test2: [2,2] 2") {
    val arr = Array(2, 2)
    solve(arr, 2) should be(Seq(0, 1))
  }
}
