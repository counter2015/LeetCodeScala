package algorithms.struct

class GraphNode(var _value: Int) {
  var value: Int = _value
  var neighbors: List[GraphNode] = List()
}
