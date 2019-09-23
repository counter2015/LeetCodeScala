package algorithms.hard.implementation

import algorithms.hard.implementation.NQueens.{solveNQueens => solve}
import org.scalatest.{FunSuite, Matchers}

class NQueensTest extends FunSuite with Matchers {

  test("test0: sample input") {
    val res = List(
      List(
        ".Q..",
        "...Q",
        "Q...",
        "..Q."),

      List("..Q.",
        "Q...",
        "...Q",
        ".Q..")
    )

    solve(4) should contain theSameElementsAs res
  }

  test("test1: n = 3") {
    val res = List.empty[List[String]]
    solve(3) should contain theSameElementsAs List()
  }
}
