package algorithms.medium.basic

import algorithms.medium.basic.SubSets.{subsets => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SubSetsTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val res = List(
      List(3),
      List(1),
      List(2),
      List(1, 2, 3),
      List(1, 3),
      List(2, 3),
      List(1, 2),
      List()
    )
    solve(Array(1, 2, 3)) should contain theSameElementsAs res
  }
}
