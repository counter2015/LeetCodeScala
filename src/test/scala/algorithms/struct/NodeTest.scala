package algorithms.struct

import scala.language.implicitConversions

trait NodeTest {
  implicit def StringToLeft(s: String): Left[String, Int] = Left(s)

  implicit def IntToRight(i: Int): Right[String, Int] = Right(i)

  def generateTreeNodesWithLevelOrderData(arr: Array[Either[String, Int]]): Node = {
    var root: Node = null
    val n = arr.length

    def insert(node: Node, i: Int): Unit =
      if (i < n) {
        val leftIndex = i * 2 + 1
        val rightIndex = i * 2 + 2

        if (leftIndex < n) {
          arr(leftIndex) match {
            case Left(_) =>
              node.left = null
            case Right(v) =>
              node.left = new Node(v)
              insert(node.left, leftIndex)
          }
        }

        if (rightIndex < n) {
          arr(rightIndex) match {
            case Left(_) =>
              node.right = null
            case Right(v) =>
              node.right = new Node(v)
              insert(node.right, rightIndex)
          }
        }
      }

    arr.headOption match {
      case Some(x) =>
        x match {
          case Right(v) =>
            root = new Node(v)
            insert(root, 0)
          case Left(_) =>
        }
      case None =>
    }
    root
  }

  def isConnected(node: Node, index: Int = 0): Boolean =
    if (node == null) true
    else {
      @scala.annotation.tailrec
      def levelTraversal(level: List[Node], f: List[Node] => Boolean): Boolean = {
        val nextLevel = level.flatMap(node => Seq(node.left, node.right)).filter(_ != null)
        (level.length.compare(0), nextLevel.length.compare(0)) match {
          case (1, 0) =>
            f(level)
          case (1, 1) =>
            f(level) && levelTraversal(nextLevel, f)
          case _ => true
        }
      }

      def isLeverConnected(nodes: List[Node]): Boolean =
        if (nodes.isEmpty) true
        else {
          var i = 0
          while (i + 1 < nodes.length) {
            if (nodes(i).next != nodes(i + 1)) return false
            i += 1
          }
          true
        }

      levelTraversal(List(node), isLeverConnected)
    }
}
