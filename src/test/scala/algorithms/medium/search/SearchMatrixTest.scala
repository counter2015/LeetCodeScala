package algorithms.medium.search

import algorithms.medium.search.SearchMatrix.{searchMatrix => solve}
import org.scalatest.{FunSuite, Matchers}

class SearchMatrixTest extends FunSuite with Matchers {

  test("test0: sample input") {
    val matrix = Array(
      Array(1, 3, 5, 7),
      Array(10, 11, 16, 20),
      Array(23, 30, 34, 50)
    )
    solve(matrix, 3) shouldBe true
  }

  test("test1: sample input") {
    val matrix = Array(
      Array(1, 3, 5, 7),
      Array(10, 11, 16, 20),
      Array(23, 30, 34, 50)
    )
    solve(matrix, 13) shouldBe false
  }

  test("test2: empty input") {
    val matrix: Array[Array[Int]] = Array(Array())
    solve(matrix, 1) shouldBe false
  }
}
