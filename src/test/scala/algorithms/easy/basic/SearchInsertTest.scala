package algorithms.easy.basic

import algorithms.easy.basic.SearchInsert.{searchInsert => solve}
import org.scalatest.{FunSuite, Matchers}

class SearchInsertTest extends FunSuite with Matchers {

  test("test0: sample input") {
    val arr = Array(1, 3, 5, 6)
    solve(arr, 2) should equal(1)
  }

  test("test1: sample input") {
    val arr = Array(1, 3, 5, 6)
    solve(arr, 7) should equal(4)
  }

  test("test2: sample input") {
    val arr = Array(1, 3, 5, 6)
    solve(arr, 0) should equal(0)
  }
}
