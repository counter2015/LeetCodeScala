package algorithms.easy.implementation

import algorithms.easy.implementation.RemoveDuplicates.{removeDuplicates => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class RemoveDuplicatesTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val arr = Array(1, 1, 2)
    solve(arr) should be(2)
    arr.init should be(Seq(1, 2))
  }

  test("test1: sample input") {
    val arr = Array(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    solve(arr) should be(5)
    arr.take(5) should be(Seq(0, 1, 2, 3, 4))
  }

}
