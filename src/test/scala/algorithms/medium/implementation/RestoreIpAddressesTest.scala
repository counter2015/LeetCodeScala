package algorithms.medium.implementation

import algorithms.medium.implementation.RestoreIpAddresses.{restoreIpAddresses => solve}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class RestoreIpAddressesTest extends AnyFunSuite with Matchers {

  test("test0: sample input") {
    val input = "25525511135"
    val res = List(
      "255.255.11.135",
      "255.255.111.35"
    )
    solve(input) should contain theSameElementsAs res
  }
}
