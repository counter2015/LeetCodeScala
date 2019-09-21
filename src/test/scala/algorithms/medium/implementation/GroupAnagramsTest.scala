package algorithms.medium.implementation

import algorithms.medium.implementation.GroupAnagrams.{groupAnagrams => solve}
import org.scalatest.{FunSuite, Matchers}

class GroupAnagramsTest extends FunSuite with Matchers {

  test("test0: sample test") {
    val strs = Array("eat", "tea", "tan", "ate", "nat", "bat")
    val res = List(List("bat"), List("eat", "tea", "ate"), List("tan", "nat"))
    solve(strs) should contain theSameElementsAs res
  }
}
