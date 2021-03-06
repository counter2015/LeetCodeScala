package algorithms.easy.implementation

import algorithms.easy.implementation.RomanToInteger.{romanToInt => solve}
import org.scalatest.funsuite.AnyFunSuite

class RomanToIntegerTest extends AnyFunSuite {

  test("test0: sample input") {
    assert(solve("III") == 3)
  }

  test("test1: sample input") {
    assert(solve("IV") == 4)
  }

  test("test2: sample input") {
    assert(solve("IX") == 9)
  }

  test("test3: sample input") {
    assert(solve("LVIII") == 58)
  }

  test("test4: sample input") {
    assert(solve("MCMXCIV") == 1994)
  }

  test("test5: 2015") {
    assert(solve("MMXV") == 2015)
  }

}
