package algorithms.medium.tree

import algorithms.struct.Node

object ConnectNodes {

  /** RunTime Info: 528 ms, 52 MB
    *
    * @param root
    *   the root node
    * @return
    *   connected nodes
    */
  def connect(root: Node): Node = {

    @scala.annotation.tailrec
    def levelTraversal[T](level: List[Node], f: List[Node] => T): Unit = {
      val nextLevel = level.flatMap(node => Seq(node.left, node.right)).filter(_ != null)
      (level.length.compare(0), nextLevel.length.compare(0)) match {
        case (1, 0) =>
          f(level)
        case (1, 1) =>
          f(level)
          levelTraversal(nextLevel, f)
        case _ => ()
      }
    }

    def connectLevel(nodes: List[Node]): Unit =
      nodes.reduceLeft { (a, b) =>
        a.next = b; b
      }

    if (root != null) levelTraversal(List(root), connectLevel)

    root
  }
}
