package algorithms.medium.tree

import algorithms.medium.tree.ConnectNodes.{connect => solve}
import algorithms.struct.NodeTest
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class ConnectNodesTest extends AnyFunSuite with Matchers with NodeTest {

  test("test0: sample input") {
    val arr: Array[Either[String, Int]] = Array(1, 2, 3, 4, 5, 6)
    val node = generateTreeNodesWithLevelOrderData(arr)
    isConnected(solve(node)) shouldBe true
  }

  test("test1: empty input") {
    val arr: Array[Either[String, Int]] = Array()
    val node = generateTreeNodesWithLevelOrderData(arr)
    isConnected(solve(node)) shouldBe true
  }
}
