package algorithms.hard.implementation

import algorithms.hard.implementation.ValidNumber.{isNumber => solve}
import org.scalatest.{FunSuite, Matchers}

class ValidNumberTest extends FunSuite with Matchers {

  test("test0: sample input") {
    solve("0") shouldBe true
  }

  test("test1: sample input") {
    solve(" 0.1 ") shouldBe true
  }

  test("test2: sample input") {
    solve("abc") shouldBe false
  }

  test("test3: sample input") {
    solve("1 a") shouldBe false
  }

  test("test4: sample input") {
    solve("2e10") shouldBe true
  }

  test("test5: sample input") {
    solve("-90e3") shouldBe true
  }

  test("test6: sample input") {
    solve(" 1e") shouldBe false
  }

  test("test7: sample input") {
    solve("e3") shouldBe false
  }

  test("test8: sample input") {
    solve("6e-1") shouldBe true
  }

  test("test9: sample input") {
    solve("99e2.5") shouldBe false
  }

  test("test10: sample input") {
    solve("53.5e93") shouldBe true
  }

  test("test11: sample input") {
    solve("--6") shouldBe false
  }

  test("test12: sample input") {
    solve("-+3") shouldBe false
  }

  test("test13: sample input") {
    solve("95a54e53") shouldBe false
  }

  test("test14: string contains `f` ") {
    solve("959440.94f") shouldBe false
  }

  test("test15: string contains `D`") {
    solve("84656e656D") shouldBe false
  }

  test("test16: Infinity") {
    solve("2E22222222222222") shouldBe true
  }
}
