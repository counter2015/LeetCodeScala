package algorithms.medium.basic

import algorithms.medium.basic.LetterCombinations.{letterCombinations => solve}
import org.scalatest.FunSuite

class LetterCombinationsTest extends FunSuite {

  test("test0: sample input") {
    assert(solve("23").toSet == Set("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"))
  }

  test("test1: empty input") {
    assert(solve("") == Nil)
  }

  test("test2: 7") {
    assert(solve("7").toSet == Set("p", "q", "r", "s"))
  }
}
