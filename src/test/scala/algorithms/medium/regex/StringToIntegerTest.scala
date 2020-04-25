package algorithms.medium.regex

import algorithms.medium.regex.StringToInteger.{myAtoi => solve}
import org.scalatest.funsuite.AnyFunSuite

class StringToIntegerTest extends AnyFunSuite {

  test("test0: sample input") {
    assert(solve("42") == 42)
  }

  test("test1: sample input") {
    assert(solve("   -42") == -42)
  }

  test("test2: sample input") {
    assert(solve("4193 with words") == 4193)
  }

  test("test3: sample input") {
    assert(solve("words and 987") == 0)
  }

  test("test4: sample input") {
    assert(solve("-91283472332") == Int.MinValue)
  }

  test("test5: greater than int max value") {
    assert(solve("+91283472332") == Int.MaxValue)
  }

  test("test6: +0") {
    assert(solve("+0") == 0)
  }

  test("test7: -0") {
    assert(solve("-0") == 0)
  }

  test("test8: 0") {
    assert(solve("0") == 0)
  }

  test("test9: leading 0") {
    assert(solve("-000234512341") == -234512341)
  }

  test("test10: int min value") {
    assert(solve("-2147483648") == Int.MinValue)
  }
}
