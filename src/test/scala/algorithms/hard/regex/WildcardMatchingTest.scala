package algorithms.hard.regex

import algorithms.hard.regex.WildcardMatching.{isMatch => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class WildcardMatchingTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val s = "aa"
    val p = "a"
    solve(s, p) shouldBe false
  }

  test("test1: sample input") {
    val s = "aa"
    val p = "*"
    solve(s, p) shouldBe true
  }

  test("test2: sample input") {
    val s = "cb"
    val p = "?a"
    solve(s, p) shouldBe false
  }

  test("test3: sample input") {
    val s = "adceb"
    val p = "*a*b"
    solve(s, p) shouldBe true
  }

  test("test4: sample input") {
    val s = "acdcb"
    val p = "a*c?b"
    solve(s, p) shouldBe false
  }

  test("test5: hard test") {
    val s = "aaaabaaaabbbbaabbbaabbaababbabbaaaababaaabbbbbbaabbbabababbaaabaabaaaaaabbaabbbbaababbababaabbbaababbbba"
    val p = "*****b*aba***babaa*bbaba***a*aaba*b*aa**a*b**ba***a*a*"
    solve(s, p) shouldBe true
  }

  test("test6: empty input") {
    val s = ""
    val p = "****"
    solve(s, p) shouldBe true
  }

  test("test7: hard test") {
    val s = "abbabaaabbabbaababbabbbbbabbbabbbabaaaaababababbbabababaabbababaabbbbbbaaaabababbbaabbbbaabbbbababababbaabbaababaabbbababababbbbaaabbbbbabaaaabbababbbbaababaabbababbbbbababbbabaaaaaaaabbbbbaabaaababaaaabb"
    val p = "**aa*****ba*a*bb**aa*ab****a*aaaaaa***a*aaaa**bbabb*b*b**aaaaaaaaa*a********ba*bbb***a*ba*bb*bb**a*b*bb"
    solve(s, p) shouldBe false
  }

}
