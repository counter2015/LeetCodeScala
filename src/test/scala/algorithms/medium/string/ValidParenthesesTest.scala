package algorithms.medium.string

import algorithms.medium.string.ValidParentheses.{isValid => solve}
import org.scalatest.funsuite.AnyFunSuite

class ValidParenthesesTest extends AnyFunSuite {

  test("test0: sample input") {
    assert(solve("()"))
  }

  test("test1: sample input") {
    assert(solve("()[]{}"))
  }

  test("test2: sample input") {
    assert(!solve("(]"))
  }

  test("test3: sample input") {
    assert(!solve("([)]"))
  }

  test("test4: sample input") {
    assert(solve("{[]}"))
  }

  test("test5: (){[[]]}(({}(()))[])") {
    assert(solve("(){[[]]}(({}(()))[])"))
  }
}
