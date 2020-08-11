package algorithms.medium.string

import algorithms.medium.string.PalindromePartition.{partition => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class PalindromePartitionTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val res = Seq(
      Seq("aa", "b"),
      Seq("a", "a", "b")
    )
    solve("aab") should contain theSameElementsAs res
  }

  test("test0: same character") {
    val res = Seq(
      Seq("aa", "a"),
      Seq("a", "aa"),
      Seq("aaa"),
      Seq("a", "a", "a")
    )
    solve("aaa") should contain theSameElementsAs res
  }
}
