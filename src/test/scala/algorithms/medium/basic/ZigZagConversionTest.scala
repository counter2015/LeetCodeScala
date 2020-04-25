package algorithms.medium.basic

import algorithms.medium.basic.ZigZagConversion.{convert => solve}
import org.scalatest.funsuite.AnyFunSuite

class ZigZagConversionTest extends AnyFunSuite {
  test("test0: sample input") {
    assert(solve("PAYPALISHIRING", 3) == "PAHNAPLSIIGYIR")
  }

  test("test1: sample input") {
    assert(solve("PAYPALISHIRING", 4) == "PINALSIGYAHRPI")
  }

  test("test2: one row") {
    assert(solve("PAYPALISHIRING", 1) == "PAYPALISHIRING")
  }

  test("test3: two row") {
    assert(solve("PAYPALISHIRING", 2) == "PYAIHRNAPLSIIG")
  }
}
