package algorithms.easy.basic

import algorithms.easy.basic.ReverseInteger.{reverse => solve}
import org.scalatest.FunSuite

class ReverseIntegerTest extends FunSuite {

  test("test0: sample input") {
    assert(solve(123) == 321)
  }

  test("test1: sample input") {
    assert(solve(-123) == -321)
  }

  test("test2: sample input") {
    assert(solve(120) == 21)
  }

  test("test3: zero") {
    assert(solve(0) == 0)
  }

  test("test4: overflow") {
    assert(solve(1123456789) == 0)
  }

  test("test5: overflow negative") {
    assert(solve(-1123456789) == 0)
  }
}
