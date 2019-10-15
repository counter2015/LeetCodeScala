package algorithms.medium.basic

import algorithms.medium.basic.SortColors.{sortColors => solve}
import org.scalatest.{FunSuite, Matchers}

class SortColorsTest extends FunSuite with Matchers {

  test("test0: sample input") {
    val arr = Array(2, 0, 2, 1, 1, 0)
    val res = Array(0, 0, 1, 1, 2, 2)
    solve(arr)
    arr should contain theSameElementsInOrderAs res
  }
}
