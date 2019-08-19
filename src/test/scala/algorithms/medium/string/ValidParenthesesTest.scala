package algorithms.medium.string

import algorithms.medium.string.ValidParentheses.{isValid => solve}
import org.scalatest.FunSuite

class ValidParenthesesTest extends FunSuite {

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
