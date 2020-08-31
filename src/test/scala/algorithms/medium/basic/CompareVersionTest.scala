package algorithms.medium.basic

import algorithms.medium.basic.CompareVersion.{compareVersion => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class CompareVersionTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val version1 = "0.1"
    val version2 = "1.1"
    solve(version1, version2) shouldBe -1
  }

  test("test1: sample input") {
    val version1 = "1.0.1"
    val version2 = "1"
    solve(version1, version2) shouldBe 1
  }

  test("test2: sample input") {
    val version1 = "7.5.2.4"
    val version2 = "7.5.3"
    solve(version1, version2) shouldBe -1
  }

  test("test3: sample input") {
    val version1 = "1.01"
    val version2 = "1.001"
    solve(version1, version2) shouldBe 0
  }

  test("test4: sample input") {
    val version1 = "1.0.0"
    val version2 = "1.0"
    solve(version1, version2) shouldBe 0
  }
}
