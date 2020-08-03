package algorithms.medium.search

import algorithms.medium.search.WordLadder.{ladderLength => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class WordLadderTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val beginWord = "hit"
    val endWord = "cog"
    val wordList = List("hot", "dot", "dog", "lot", "log", "cog")
    solve(beginWord, endWord, wordList) shouldBe 5
  }

  test("test1: sample input") {
    val beginWord = "hit"
    val endWord = "cog"
    val wordList = List("hot", "dot", "dog", "lot", "log")
    solve(beginWord, endWord, wordList) shouldBe 0
  }
}
