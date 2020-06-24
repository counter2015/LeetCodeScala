package algorithms.medium.basic

import algorithms.medium.basic.MostWaterContainer.{maxArea => solve, maxAreaB => solve2}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MostWaterContainerTest extends AnyFunSuite with Matchers {

  test("test0: sample test") {
    solve(Array(1, 8, 6, 2, 5, 4, 8, 3, 7)) shouldBe 49
    solve2(Array(1, 8, 6, 2, 5, 4, 8, 3, 7)) shouldBe 49
  }

  test("test1: same element") {
    solve(Array(2, 2, 2, 2, 2)) shouldBe 8
    solve2(Array(2, 2, 2, 2, 2)) shouldBe 8
  }

  test("test2: ordered number") {
    solve(Array(1, 2, 3, 4, 5)) shouldBe 6
    solve2(Array(1, 2, 3, 4, 5)) shouldBe 6
  }
}
