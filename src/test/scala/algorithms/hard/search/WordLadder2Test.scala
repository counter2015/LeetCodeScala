package algorithms.hard.search

import algorithms.hard.search.WordLadder2.{findLadders => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class WordLadder2Test extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val beginWord = "hit"
    val endWord = "cog"
    val wordList = List("hot", "dot", "dog", "lot", "log", "cog")
    val res = solve(beginWord, endWord, wordList)
    val ans = List(
      List("hit", "hot", "dot", "dog", "cog"),
      List("hit", "hot", "lot", "log", "cog"))

    res.sortBy(_.mkString) should contain theSameElementsInOrderAs ans.sortBy(_.mkString)
  }

  test("test1: sample input") {
    val beginWord = "hit"
    val endWord = "cog"
    val wordList = List("hot", "dot", "dog", "lot", "log")
    val res = solve(beginWord, endWord, wordList)

    res shouldBe Nil
  }

  test("test2: a to c") {
    val beginWord = "a"
    val endWord = "c"
    val wordList = List("a", "b", "c")
    val res = solve(beginWord, endWord, wordList)
    val ans = List(
      List("a", "c"))
    res should contain theSameElementsInOrderAs ans
  }


  test("test3: complex input") {
    val beginWord = "qa"
    val endWord = "sq"
    val wordList = List(
      "si", "go", "se", "cm", "so", "ph", "mt", "db", "mb", "sb",
      "kr", "ln", "tm", "le", "av", "sm", "ar", "ci", "ca", "br",
      "ti", "ba", "to", "ra", "fa", "yo", "ow", "sn", "ya", "cr",
      "po", "fe", "ho", "ma", "re", "or", "rn", "au", "ur", "rh",
      "sr", "tc", "lt", "lo", "as", "fr", "nb", "yb", "if", "pb",
      "ge", "th", "pm", "rb", "sh", "co", "ga", "li", "ha", "hz",
      "no", "bi", "di", "hi", "qa", "pi", "os", "uh", "wm", "an",
      "me", "mo", "na", "la", "st", "er", "sc", "ne", "mn", "mi",
      "am", "ex", "pt", "io", "be", "fm", "ta", "tb", "ni", "mr",
      "pa", "he", "lr", "sq", "ye")
    val res = solve(beginWord, endWord, wordList)
    val ans = List(
      List("qa", "ca", "cm", "sm", "sq"),
      List("qa", "ca", "ci", "si", "sq"),
      List("qa", "ca", "cr", "sr", "sq"),
      List("qa", "ca", "co", "so", "sq"),
      List("qa", "ba", "br", "sr", "sq"),
      List("qa", "ba", "bi", "si", "sq"),
      List("qa", "ba", "be", "se", "sq"),
      List("qa", "ra", "re", "se", "sq"),
      List("qa", "ra", "rn", "sn", "sq"),
      List("qa", "ra", "rh", "sh", "sq"),
      List("qa", "ra", "rb", "sb", "sq"),
      List("qa", "fa", "fe", "se", "sq"),
      List("qa", "fa", "fr", "sr", "sq"),
      List("qa", "fa", "fm", "sm", "sq"),
      List("qa", "ya", "yo", "so", "sq"),
      List("qa", "ya", "yb", "sb", "sq"),
      List("qa", "ya", "ye", "se", "sq"),
      List("qa", "ma", "mt", "st", "sq"),
      List("qa", "ma", "mb", "sb", "sq"),
      List("qa", "ma", "me", "se", "sq"),
      List("qa", "ma", "mo", "so", "sq"),
      List("qa", "ma", "mn", "sn", "sq"),
      List("qa", "ma", "mi", "si", "sq"),
      List("qa", "ma", "mr", "sr", "sq"),
      List("qa", "ga", "go", "so", "sq"),
      List("qa", "ga", "ge", "se", "sq"),
      List("qa", "ha", "ho", "so", "sq"),
      List("qa", "ha", "hi", "si", "sq"),
      List("qa", "ha", "he", "se", "sq"),
      List("qa", "na", "nb", "sb", "sq"),
      List("qa", "na", "no", "so", "sq"),
      List("qa", "na", "ne", "se", "sq"),
      List("qa", "na", "ni", "si", "sq"),
      List("qa", "la", "ln", "sn", "sq"),
      List("qa", "la", "le", "se", "sq"),
      List("qa", "la", "lt", "st", "sq"),
      List("qa", "la", "lo", "so", "sq"),
      List("qa", "la", "li", "si", "sq"),
      List("qa", "la", "lr", "sr", "sq"),
      List("qa", "ta", "tm", "sm", "sq"),
      List("qa", "ta", "ti", "si", "sq"),
      List("qa", "ta", "to", "so", "sq"),
      List("qa", "ta", "tc", "sc", "sq"),
      List("qa", "ta", "th", "sh", "sq"),
      List("qa", "ta", "tb", "sb", "sq"),
      List("qa", "pa", "ph", "sh", "sq"),
      List("qa", "pa", "po", "so", "sq"),
      List("qa", "pa", "pb", "sb", "sq"),
      List("qa", "pa", "pm", "sm", "sq"),
      List("qa", "pa", "pi", "si", "sq"),
      List("qa", "pa", "pt", "st", "sq"))
    res.sortBy(_.mkString) should contain theSameElementsInOrderAs ans.sortBy(_.mkString)
  }
}
