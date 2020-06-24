package algorithms.medium.string

import algorithms.medium.string.LongestPalindrome.{longestPalindrome => solve, manachersAlgorithm => solve2}
import org.scalatest.funsuite.AnyFunSuite

class LongestPalindromeTest extends AnyFunSuite {

  test("test0: sample input") {
    val result = Array("bab", "aba")
    assert(result.contains(solve("babad")))
    assert(result.contains(solve2("babad")))
  }

  test("test1: sample input") {
    val result = Array("bb")
    assert(result.contains(solve("abbd")))
    assert(result.contains(solve2("abbd")))
  }

  test("test2: sample input") {
    val result = Array("abcccba", "babcbab")
    assert(result.contains(solve("babcbabcccba")))
    assert(result.contains(solve2("babcbabcccba")))
  }

  test("test3: cbbd") {
    val result = Array("bb")
    assert(result.contains(solve("cbbd")))
    assert(result.contains(solve2("cbbd")))
  }

  test("test4: null string") {
    val result = Array("")
    assert(result.contains(solve("")))
    assert(result.contains(solve2("")))
  }

  test("test5: one element") {
    val result = Array("z")
    assert(result.contains(solve("z")))
    assert(result.contains(solve2("z")))
  }

  test("test6: distinct element") {
    val result = Array("z", "q", "x")
    assert(result.contains(solve("zqx")))
    assert(result.contains(solve2("zqx")))
  }
}
