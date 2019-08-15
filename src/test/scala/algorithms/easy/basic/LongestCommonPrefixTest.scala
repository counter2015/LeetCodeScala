package algorithms.easy.basic

import algorithms.easy.basic.LongestCommonPrefix.{longestCommonPrefix => solve}
import org.scalatest.FunSuite

class LongestCommonPrefixTest extends FunSuite {

  test("test0: sample input") {
    assert(solve(Array("flower", "flow", "flight")) == "fl")
  }

  test("test1: sample input") {
    assert(solve(Array("dog", "racecar", "car")) == "")
  }

  test("test2: same element") {
    assert(solve(Array("aaaaa", "aaaaa", "aaaaa")) == "aaaaa")
  }

  test("test3: empty array") {
    assert(solve(Array()) == "")
  }
}
