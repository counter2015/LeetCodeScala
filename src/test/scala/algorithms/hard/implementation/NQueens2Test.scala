package algorithms.hard.implementation

import algorithms.hard.implementation.NQueens2.{totalNQueens => solve}
import org.scalatest.{FunSuite, Matchers}

class NQueens2Test extends FunSuite with Matchers {

  test("test0: sample input") {
    solve(4) shouldBe 2
  }

  test("test1: n=1") {
    solve(1) shouldBe 1
  }

}
