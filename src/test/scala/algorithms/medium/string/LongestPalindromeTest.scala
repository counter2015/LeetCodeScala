package algorithms.medium.string

import algorithms.medium.string.LongestPalindrome.{longestPalindrome => solve}
import org.scalatest.funsuite.AnyFunSuite

class LongestPalindromeTest extends AnyFunSuite {

  test("test0: sample input") {
    val result = Array("bab", "aba")
    assert(result.contains(solve("babad")))
  }

  test("test1: sample input") {
    val result = Array("bb")
    assert(result.contains(solve("abbd")))
  }

  test("test2: sample input") {
    val result = Array("abcccba", "babcbab")
    assert(result.contains(solve("babcbabcccba")))
  }

  test("test3: cbbd") {
    val result = Array("bb")
    assert(result.contains(solve("cbbd")))
  }

  test("test4: null string") {
    val result = Array("")
    assert(result.contains(solve("")))
  }

  test("test5: one element") {
    val result = Array("z")
    assert(result.contains(solve("z")))
  }

  test("test6: distinct element") {
    val result = Array("z", "q", "x")
    assert(result.contains(solve("zqx")))
  }
}
