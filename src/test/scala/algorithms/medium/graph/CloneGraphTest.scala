package algorithms.medium.graph

import algorithms.medium.graph.CloneGraph.{cloneGraph => solve}
import algorithms.struct.{GraphNode, GraphNodeTest}
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers

class CloneGraphTest extends AnyFunSuite with Matchers with GraphNodeTest {

  test("test0: sample input") {
    val g = generateGraphFormEdges(List(
      (1, 2),
      (1, 4),
      (2, 3),
      (3, 4)
    ))
    val ng = solve(g)

    graphToEdges(g) should contain theSameElementsInOrderAs graphToEdges(ng)
    ng.value = ng.value + 1
    assert(ng.value != g.value, "graph should be deep copy")
  }

  test("test1: sample input") {
    val g = new GraphNode(1)
    val ng = solve(g)
    ng.value = ng.value + 1
    assert(ng.value != g.value, "graph should be deep copy")
  }

  test("test2: sample input") {
    val g = null
    val ng = solve(g)
    assert(ng == null, "empty graph should return null result")
  }

  test("test3: sample input") {
    val g = generateGraphFormEdges(List(
      (1, 2)
    ))
    val ng = solve(g)

    graphToEdges(g) should contain theSameElementsInOrderAs graphToEdges(ng)
    ng.value = ng.value + 1
    assert(ng.value != g.value, "graph should be deep copy")
  }
}
