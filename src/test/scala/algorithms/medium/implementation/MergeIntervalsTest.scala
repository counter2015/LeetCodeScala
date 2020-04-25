package algorithms.medium.implementation

import algorithms.medium.implementation.MergeIntervals.{merge => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MergeIntervalsTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val input = Array(Array(1, 3), Array(2, 6), Array(8, 10), Array(15, 18))
    val res = Array(Array(1, 6), Array(8, 10), Array(15, 18))
    solve(input) shouldBe res
  }

  test("test1: sample input") {
    val input = Array(Array(1, 4), Array(4, 5))
    val res = Array(Array(1, 5))
    solve(input) shouldBe res
  }

  test("test2: Array((1,3), (1,4), (2,6), (2,6), (8,13), (9,10), (15,20))") {
    val input = Array(Array(15, 20), Array(2, 6), Array(1, 3), Array(1, 4), Array(2, 6), Array(8, 13), Array(9, 10))
    val res = Array(Array(1, 6), Array(8, 13), Array(15, 20))
    solve(input) shouldBe res
  }

  test("test3: empty input") {
    val input: Array[Array[Int]] = Array(Array())
    val res = Array(Array())
    solve(input) shouldBe res
  }
}
