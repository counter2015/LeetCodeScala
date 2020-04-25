package algorithms.hard.implementation

import algorithms.hard.implementation.MaximalRectangle.{maximalRectangle => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MaximalRectangleTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val board = Array(
      Array('1', '0', '1', '0', '0'),
      Array('1', '0', '1', '1', '1'),
      Array('1', '1', '1', '1', '1'),
      Array('1', '0', '0', '1', '0')
    )
    solve(board) shouldBe 6
  }

  test("test1: empty input") {
    val board = Array.empty[Array[Char]]
    solve(board) shouldBe 0
  }

  test("test2: all 1") {
    val board = Array(
      Array('1', '1', '1', '1'),
      Array('1', '1', '1', '1'),
      Array('1', '1', '1', '1')
    )
    solve(board) shouldBe 12
  }

}
