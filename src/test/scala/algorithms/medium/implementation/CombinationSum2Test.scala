package algorithms.medium.implementation

import algorithms.medium.implementation.CombinationSum2.{combinationSum2 => solve}
import org.scalatest.{FunSuite, Matchers}

class CombinationSum2Test extends FunSuite with Matchers {

  test("test0: sample input") {
    val candidates = Array(10, 1, 2, 7, 6, 1, 5)
    val target = 8
    val res = Array(
      Seq(1, 7),
      Seq(1, 2, 5),
      Seq(2, 6),
      Seq(1, 1, 6)).map(_.sorted)

    val ans = solve(candidates, target).map(_.sorted)
    res should contain theSameElementsAs ans
  }

  test("test1: sample input") {
    val candidates = Array(2, 5, 2, 1, 2)
    val target = 5
    val res = Seq(
      Seq(1, 2, 2),
      Seq(5)).map(_.sorted)

    val ans = solve(candidates, target).map(_.sorted)
    res should contain theSameElementsAs ans
  }
}
