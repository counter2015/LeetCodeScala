package algorithms.easy.basic

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import algorithms.easy.basic.ExcelSheetColumnTitle.{convertToTitle => solve}

class ExcelSheetColumnTitleTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve(1) shouldBe "A"
  }

  test("test1: sample input") {
    solve(28) shouldBe "AB"
  }

  test("test2: sample input") {
    solve(701) shouldBe "ZY"
  }

  test("test3: 52") {
    solve(52) shouldBe "AZ"
  }
}
