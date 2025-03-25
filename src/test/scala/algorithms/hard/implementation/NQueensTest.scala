package algorithms.hard.implementation

import algorithms.hard.implementation.NQueens.{solveNQueens => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class NQueensTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val res = List(
      List(".Q..", "...Q", "Q...", "..Q."),
      List("..Q.", "Q...", "...Q", ".Q..")
    )

    solve(4) should contain theSameElementsAs res
  }

  test("test1: n = 3") {
    val res = List.empty[List[String]]
    solve(3) should contain theSameElementsAs List()
  }
}
