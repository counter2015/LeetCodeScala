package algorithms.hard.implementation

import algorithms.hard.implementation.InsertInterval.{insert => solve}
import org.scalatest.{FunSuite, Matchers}

class InsertIntervalTest extends FunSuite with Matchers {

  test("test0: sample input") {
    val input = Array(Array(1, 3), Array(6, 9))
    val insert = Array(2, 5)
    val res = Array(Array(1, 5), Array(6, 9))
    solve(input, insert) shouldBe res
  }

  test("test1: sample input") {
    val input = Array(Array(1, 2), Array(3, 5), Array(6, 7), Array(8, 10), Array(12, 16))
    val insert = Array(4, 8)
    val res = Array(Array(1, 2), Array(3, 10), Array(12, 16))
    solve(input, insert) shouldBe res
  }

  test("test2: empty input") {
    val input: Array[Array[Int]] = Array(Array())
    val insert = Array(2, 5)
    val res = Array(Array(2, 5))
    solve(input, insert) shouldBe res
  }

  test("test3: empty insert") {
    val input = Array(Array(1, 3), Array(6, 9))
    val insert: Array[Int] = Array()
    val res = Array(Array(1, 3), Array(6, 9))
    solve(input, insert) shouldBe res
  }
}
