package algorithms.hard.implementation

import algorithms.hard.implementation.TextJustification.{fullJustify => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class TextJustificationTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val text = Array("This", "is", "an", "example", "of", "text", "justification.")
    val res = List(
      "This    is    an",
      "example  of text",
      "justification.  ")
    solve(text, 16) shouldBe res
  }

  test("test1: sample input") {
    val text = Array("What", "must", "be", "acknowledgment", "shall", "be")
    val res = List(
      "What   must   be",
      "acknowledgment  ",
      "shall be        ")
    solve(text, 16) shouldBe res
  }

  test("test2: sample input") {
    val text = Array("Science", "is", "what", "we", "understand", "well", "enough", "to", "explain",
      "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do")
    val res = List(
      "Science  is  what we",
      "understand      well",
      "enough to explain to",
      "a  computer.  Art is",
      "everything  else  we",
      "do                  ")
    solve(text, 20) shouldBe res
  }

}
