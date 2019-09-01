package algorithms.hard.string

import algorithms.hard.string.FindSubstring.{findSubstring => solve}
import org.scalatest.{FunSuite, Matchers}

class FindSubstringTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve("barfoothefoobarman", Array("foo", "bar")) should contain theSameElementsAs Seq(0, 9)
  }

  test("test1: sample input") {
    solve("wordgoodgoodgoodbestword", Array("word", "good", "best", "word")) should contain theSameElementsAs Nil
  }

  test("test2: same string") {
    solve("aaaaaaaa", Array("aa", "aa", "aa")) should contain theSameElementsAs Seq(0, 1, 2)
  }

  test("test3: long string") {
    val s = "ab" * 1000
    val words = Array.fill(1000)("ab", "ba").map(x => Array(x._1, x._2)).flatten
    solve(s, words) should contain theSameElementsAs Nil
  }
}
