package algorithms.medium.implementation

import algorithms.medium.implementation.SetMatrixZeros.{setZeroes => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SetMatrixZerosTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val matrix = Array(
      Array(1, 1, 1),
      Array(1, 0, 1),
      Array(1, 1, 1)
    )

    val res = Array(
      Array(1, 0, 1),
      Array(0, 0, 0),
      Array(1, 0, 1)
    )
    solve(matrix)
    matrix should contain theSameElementsAs res
  }

  test("test1: sample input") {
    val matrix = Array(
      Array(0, 1, 2, 0),
      Array(3, 4, 5, 2),
      Array(1, 3, 1, 5)
    )

    val res = Array(
      Array(0, 0, 0, 0),
      Array(0, 4, 5, 0),
      Array(0, 3, 1, 0)
    )

    solve(matrix)
    matrix should contain theSameElementsAs res
  }

  test("test2") {
    val matrix = Array(
      Array(1, 1, 1),
      Array(0, 1, 2)
    )

    val res = Array(
      Array(0, 1, 1),
      Array(0, 0, 0)
    )
    solve(matrix)
    matrix should contain theSameElementsAs res
  }
}
