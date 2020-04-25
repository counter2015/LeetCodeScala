package algorithms.medium.implementation

import algorithms.medium.implementation.SimplifyPath.{simplifyPath => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class SimplifyPathTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    solve("/home/") shouldBe "/home"
  }

  test("test1: sample input") {
    solve("/../") shouldBe "/"
  }

  test("test2: sample input") {
    solve("/home//foo/") shouldBe "/home/foo"
  }

  test("test3: sample input") {
    solve("/a/./b/../../c/") shouldBe "/c"
  }

  test("test4: sample input") {
    solve("/a/../../b/../c//.//") shouldBe "/c"
  }

  test("test5: sample input") {
    solve("/a//b////c/d//././/..") shouldBe "/a/b/c"
  }

}
