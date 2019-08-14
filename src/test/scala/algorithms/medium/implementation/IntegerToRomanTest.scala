package algorithms.medium.implementation

import algorithms.medium.implementation.IntegerToRoman.{intToRoman => solve}
import org.scalatest.FunSuite

class IntegerToRomanTest extends FunSuite {

  test("test0: sample input") {
    assert(solve(3) == "III")
  }

  test("test1: sample input") {
    assert(solve(4) == "IV")
  }

  test("test2: sample input") {
    assert(solve(9) == "IX")
  }

  test("test3: sample input") {
    assert(solve(58) == "LVIII")
  }

  test("test4: sample input") {
    assert(solve(1994) == "MCMXCIV")
  }

  test("test5: 2015") {
    assert(solve(2015) == "MMXV")
  }
}
