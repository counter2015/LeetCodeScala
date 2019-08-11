package algorithms.easy.basic

import algorithms.easy.basic.PalindromeNumber.{isPalindrome => solve}
import org.scalatest.FunSuite

class PalindromeNumberTest extends FunSuite {

  test("test0: sample input") {
    assert(solve(121))
  }

  test("test1: sample input") {
    assert(!solve(-121))
  }

  test("test2: sample input") {
    assert(!solve(10))
  }

  test("test3: 0") {
    assert(solve(0))
  }

  test("test4: 22222") {
    assert(solve(22222))
  }
}
