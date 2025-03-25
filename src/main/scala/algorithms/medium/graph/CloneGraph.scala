package algorithms.medium.graph

import algorithms.struct.{GraphNode => Node}

import scala.collection.mutable

object CloneGraph {

  /** RunTime Info: 552 ms, 52.9 MB
    *
    * @param graph
    *   the graph
    * @return
    *   a new cloned graph
    */
  def cloneGraph(graph: Node): Node = {
    if (graph == null) return null
    if (graph.neighbors == null || graph.neighbors.isEmpty) return new Node(graph.value)
    val visit: mutable.SortedMap[Int, Node] = mutable.SortedMap[Int, Node]().withDefaultValue(null)

    def clone(n: Node): Unit = {
      visit(n.value) = new Node(n.value)
      for (neighbor <- n.neighbors) {
        if (visit(neighbor.value) == null)
          clone(neighbor)
        visit(n.value).neighbors :+= visit(neighbor.value)
      }
    }

    clone(graph)
    visit.head._2
  }
}
