package algorithms.hard.string

import algorithms.hard.string.EditDistance.{minDistance => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class EditDistanceTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("horse", "ros") shouldBe 3
  }

  test("test1: sample input") {
    solve("intention", "execution") shouldBe 5
  }

  test("test2: long string") {
    solve("dinitrophenylhydrazine", "acetylphenylhydrazine") shouldBe 6
  }
}
