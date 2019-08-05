package algorithms.medium.string

import algorithms.medium.string.LengthOfLongestSubstring.{lengthOfLongestSubstring => solve}
import org.scalatest.FunSuite

class LengthOfLongestSubstringTest extends FunSuite {

  test("test0: sample input") {
    assert(solve("abcabcbb") == 3)
  }

  test("test1: sample input") {
    assert(solve("bbbbb") == 1)
  }

  test("test2: sample input") {
    assert(solve("pwwkew") == 3)
  }

  test("test3: one element") {
    assert(solve("a") == 1)
  }

  test("test4: dvdf") {
    assert(solve("dvdf") == 3)
  }

  test("test5: abba") {
    assert(solve("abba") == 2)
  }

  test("test6: tmmzuxt") {
    assert(solve("tmmzuxt") == 5)
  }
}
