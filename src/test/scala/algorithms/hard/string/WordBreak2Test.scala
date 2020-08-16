package algorithms.hard.string

import algorithms.hard.string.WordBreak2.{wordBreak => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class WordBreak2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val s = "catsanddog"
    val words = List("cat", "cats", "and", "sand", "dog")
    val res = List("cats and dog",
      "cat sand dog")
    solve(s, words) should contain theSameElementsAs res
  }

  test("test1: sample input") {
    val s = "pineapplepenapple"
    val words = List("apple", "pen", "applepen", "pine", "pineapple")
    val res = List("pine apple pen apple",
      "pineapple pen apple",
      "pine applepen apple")
    solve(s, words) should contain theSameElementsAs res
  }

  test("test2: sample input") {
    val s = "catsandog"
    val words = List("cats", "dog", "sand", "and", "cat")
    val res = List()
    solve(s, words) should contain theSameElementsAs res
  }
}
