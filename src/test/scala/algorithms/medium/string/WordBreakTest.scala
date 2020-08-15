package algorithms.medium.string

import algorithms.medium.string.WordBreak.{wordBreak => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class WordBreakTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val s = "leetcode"
    val wordDict = List("leet", "code")
    solve(s, wordDict) shouldBe true
  }

  test("test1: sample input") {
    val s = "applepenapple"
    val wordDict = List("apple", "pen")
    solve(s, wordDict) shouldBe true
  }

  test("test2: sample input") {
    val s = "catsandog"
    val wordDict = List("cats", "dog", "sand", "and", "cat")
    solve(s, wordDict) shouldBe false
  }
}
