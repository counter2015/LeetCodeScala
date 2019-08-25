package algorithms.hard.implementation

import algorithms.hard.implementation.MergeKLists.{mergeKLists => solve}
import algorithms.struct.ListNodeTest
import org.scalatest.FunSuite

class MergeKListsTest extends FunSuite with ListNodeTest {

  test("test0: sample input") {
    val data = Array(Array(1, 4, 5), Array(1, 3, 4), Array(2, 6))
    val arr = data.map(generateListNodesWithData)
    assert(sameElement(solve(arr), generateListNodesWithData(data.flatten.sorted)))
  }

  test("test1: empty set input") {
    val data: Array[Array[Int]] = Array(Array())
    val arr = data.map(generateListNodesWithData)
    assert(sameElement(solve(arr), generateListNodesWithData(data.flatten.sorted)))
  }

  test("test2: [[1,2],[0,2,6],[1,66,78]]") {
    val data = Array(Array(1, 2), Array(0, 2, 6), Array(1, 66, 78))
    val arr = data.map(generateListNodesWithData)
    assert(sameElement(solve(arr), generateListNodesWithData(data.flatten.sorted)))
  }

}
