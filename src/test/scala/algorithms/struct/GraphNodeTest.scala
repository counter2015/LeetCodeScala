package algorithms.struct

import scala.collection.mutable

trait GraphNodeTest {
  def generateGraphFormEdges(data: List[(Int, Int)]): GraphNode = {
    val res = mutable.SortedMap[Int, GraphNode]().withDefaultValue(null)

    def setOrUpdate(i: Int, j: Int): Unit = {
      if (res(i) == null)
        res(i) = new GraphNode(i)
      if (res(j) == null)
        res(j) = new GraphNode(j)
      if (!res(i).neighbors.contains(j)) res(i).neighbors = res(i).neighbors :+ res(j)
      if (!res(j).neighbors.contains(i)) res(j).neighbors = res(j).neighbors :+ res(i)
    }

    for ((a, b) <- data)
      setOrUpdate(a, b)
    res.head._2
  }

  def graphToEdges(g: GraphNode): List[(Int, Int)] = {
    val res = mutable.Map[Int, mutable.ListBuffer[Int]]().withDefaultValue(null)

    def visit(node: GraphNode): Unit =
      if (node != null && node.neighbors != null)
        for (neighbor <- node.neighbors) {
          if (res(node.value) == null) {
            res(node.value) = mutable.ListBuffer(neighbor.value)
          } else res(node.value) += neighbor.value
          if (res(neighbor.value) == null) visit(neighbor)
        }

    visit(g)
    val ans = mutable.ListBuffer[(Int, Int)]()
    for ((k, vs) <- res; v <- vs if k < v)
      ans.+=((k, v))
    ans.toList.sortBy(_._1).distinct
  }

}
