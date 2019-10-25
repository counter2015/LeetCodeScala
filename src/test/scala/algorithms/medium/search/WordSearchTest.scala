package algorithms.medium.search

import algorithms.medium.search.WordSearch.{exist => solve}
import org.scalatest.{FunSuite, Matchers}

class WordSearchTest extends FunSuite with Matchers {

  val board = Array(
    Array('A', 'B', 'C', 'E'),
    Array('S', 'F', 'C', 'S'),
    Array('A', 'D', 'E', 'E')
  )

  test("test0: sample input") {
    val target = "ABCCED"
    solve(board, target) shouldBe true
  }

  test("test1: sample input") {
    val target = "SEE"
    solve(board, target) shouldBe true
  }

  test("test2: sample input") {
    val target = "ABCB"
    solve(board, target) shouldBe false
  }

  test("test3: abcd cant find abcd") {
    val board = Array(
      Array('a', 'b'),
      Array('c', 'd')
    )

    val target = "abcd"
    solve(board, target) shouldBe false
  }

  test("test4: single element") {
    val board = Array(Array('a'))
    val target = "a"
    solve(board, target) shouldBe true
  }

  test("test5: aa cant find aaa") {
    val board = Array(Array('a'), Array('a'))
    val target = "aaa"
    solve(board, target) shouldBe false
  }

  test("test6: normal test") {
    val board = Array(
      Array('C', 'A', 'A'),
      Array('A', 'A', 'A'),
      Array('B', 'C', 'D')
    )

    val target = "AAB"
    solve(board, target) shouldBe true
  }

}
