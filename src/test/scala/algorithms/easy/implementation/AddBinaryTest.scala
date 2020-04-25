package algorithms.easy.implementation

import algorithms.easy.implementation.AddBinary.{addBinary => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class AddBinaryTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("11", "1") shouldBe "100"
  }

  test("test1: sample input") {
    solve("1010", "1011") shouldBe "10101"
  }

  test("test2: big value") {
    val a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101"
    val b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
    val c = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000"
    solve(a, b) shouldBe c
  }
}
