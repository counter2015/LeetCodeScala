package algorithms.medium.search

import algorithms.medium.search.SurroundedRegions.solve
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SurroundedRegionsTest extends AnyFunSuite with Matchers {
  def toCharSeqs(s: String): Array[Array[Char]] = s.trim.split("\n").map(_.trim.toCharArray.filter(_ != ' '))

  def recover(xs: Array[Array[Char]]): String = xs.map(_.mkString).mkString("\n")

  test("test0: sample input") {
    val board =
      """
        |X X X X
        |X O O X
        |X X O X
        |X O X X""".stripMargin.trim


    val bs = toCharSeqs(board)

    solve(bs)

    val res =
      """
        |X X X X
        |X X X X
        |X X X X
        |X O X X""".stripMargin

    val rs = toCharSeqs(res)
    recover(bs) shouldBe recover(rs)
  }

  test("test1: empty input") {
    val bs = Array[Array[Char]]()

    solve(bs) shouldBe bs
  }
}
