package algorithms.hard.regex

import algorithms.hard.regex.RegularExpressionMatching.{isMatch => solve}
import org.scalatest.FunSuite

class RegularExpressionMatchingTest extends FunSuite {

  test("test0: sample test") {
    assert(!solve("aa", "a"))
  }

  test("test1: sample test") {
    assert(solve("aa", "a*"))
  }

  test("test2: sample test") {
    assert(solve("ab", ".*"))
  }

  test("test3: sample test") {
    assert(!solve("aa", "a"))
  }

  test("test4: sample input") {
    assert(solve("aab", "c*a*b"))
  }

  test("test5: sample input") {
    assert(!solve("mississippi", "mis*is*p*."))
  }

  test("test6: aaa a.a") {
    assert(solve("aaa", "a.a"))
  }
}
