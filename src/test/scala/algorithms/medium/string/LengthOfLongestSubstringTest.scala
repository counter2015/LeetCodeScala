package algorithms.medium.string

import algorithms.medium.string.LengthOfLongestSubstring.lengthOfLongestSubstring
import org.scalatest.FunSuite

class LengthOfLongestSubstringTest extends FunSuite {

  test("test0: sample input") {
    assert(lengthOfLongestSubstring("abcabcbb") == 3)
  }

  test("test1: sample input") {
    assert(lengthOfLongestSubstring("bbbbb") == 1)
  }

  test("test2: sample input") {
    assert(lengthOfLongestSubstring("pwwkew") == 3)
  }

  test("test3: one element") {
    assert(lengthOfLongestSubstring("a") == 1)
  }

  test("test4: dvdf") {
    assert(lengthOfLongestSubstring("dvdf") == 3)
  }

  test("test5: abba") {
    assert(lengthOfLongestSubstring("abba") == 2)
  }

  test("test6: tmmzuxt") {
    assert(lengthOfLongestSubstring("tmmzuxt") == 5)
  }
}
