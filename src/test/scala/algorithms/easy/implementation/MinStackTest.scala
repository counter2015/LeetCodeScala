package algorithms.easy.implementation

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class MinStackTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val s = new MinStack()
    s.push(-2)
    s.push(0)
    s.push(-3)
    s.getMin shouldBe -3
    s.pop()
    s.top() shouldBe 0
    s.getMin shouldBe -2
  }
}
