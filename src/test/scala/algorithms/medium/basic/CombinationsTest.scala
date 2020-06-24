package algorithms.medium.basic

import algorithms.medium.basic.Combinations.{combine => solve, combine2 => solve2}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class CombinationsTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val res = List(
      List(2, 4),
      List(3, 4),
      List(2, 3),
      List(1, 2),
      List(1, 3),
      List(1, 4),
    )
    solve(4, 2) should contain theSameElementsAs res
    solve2(4, 2) should contain theSameElementsAs res
  }
}
