package algorithms.medium.implementation

import algorithms.medium.implementation.CombinationSum.{combinationSum => solve}
import org.scalatest.{FunSuite, Matchers}


class CombinationSumTest extends FunSuite with Matchers {

  test("test0: sample input") {
    val candidates = Array(2, 3, 6, 7)
    val target = 7
    val res = Array(Array(7), Array(2, 2, 3)).map(_.sorted)

    val ans = solve(candidates, target).map(_.sorted)
    res should contain theSameElementsAs ans
  }

  test("test1: sample input") {
    val candidates = Array(2, 3, 5)
    val target = 8
    val res = Seq(
      Seq(2, 2, 2, 2),
      Seq(2, 3, 3),
      Seq(3, 5)).map(_.sorted)

    val ans = solve(candidates, target).map(_.sorted)

    res should contain theSameElementsAs ans
  }
}
