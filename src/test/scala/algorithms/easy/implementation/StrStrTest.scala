package algorithms.easy.implementation

import algorithms.easy.implementation.StrStr.{strStr => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class StrStrTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("hello", "ll") should be(2)
  }

  test("test1: sample input") {
    solve("aaaa", "bba") should be(-1)
  }

  test("test2: empty target") {
    solve("zqx3607", "") should be(0)
  }

  test("test3: same string") {
    solve("same string", "same string") should be(0)
  }

  test("test4: target string longer than source string") {
    solve("source", "target string longer than source string") should be(-1)
  }
}
