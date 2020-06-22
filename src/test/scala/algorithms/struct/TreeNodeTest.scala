package algorithms.struct

import scala.language.implicitConversions

trait TreeNodeTest {

  implicit def StringToLeft(s: String): Left[String, Int] = Left(s)

  implicit def IntToRight(i: Int): Right[String, Int] = Right(i)

  def generateTreeNodesWithLevelOrderData(arr: Array[Either[String, Int]]): TreeNode = {
    var root: TreeNode = null
    val n = arr.length

    def insert(node: TreeNode, i: Int): Unit = {
      if (i < n) {
        val leftIndex = i * 2 + 1
        val rightIndex = i * 2 + 2

        if (leftIndex < n) {
          arr(leftIndex) match {
            case Left(_) =>
              node.left = null
            case Right(v) =>
              node.left = new TreeNode(v)
              insert(node.left, leftIndex)
          }
        }

        if (rightIndex < n) {
          arr(rightIndex) match {
            case Left(_) =>
              node.right = null
            case Right(v) =>
              node.right = new TreeNode(v)
              insert(node.right, rightIndex)
          }
        }
      }
    }

    arr.headOption match {
      case Some(x) =>
        x match {
          case Right(v) =>
            root = new TreeNode(v)
            insert(root, 0)
          case Left(_) =>
        }
      case None =>
    }
    root
  }

  def sameElement(a: TreeNode, b: TreeNode): Boolean = {
    if (a == null && b == null) true
    else if (a != null && b != null) {
      a.value == b.value && sameElement(a.left, b.left) && sameElement(a.right, b.right)
    } else false
  }

  def elements(root: TreeNode): List[Int] = {
    import algorithms.medium.tree.InorderTraversal.inorderTraversal
    inorderTraversal(root)
  }

  def isSored(root: TreeNode)(implicit ordering: Ordering[Int]): Boolean = {
    elements(root).sliding(2).forall { case Seq(a, b) => ordering.lteq(a, b) }
  }

  def cloneTreeNode(root: TreeNode): TreeNode = {
    val node = new TreeNode()
    if (root == null) node
    else {
      node.value = root.value
      if (root.left != null)
        node.left = cloneTreeNode(root.left)

      if (root.right != null)
        node.right = cloneTreeNode(root.right)
      node
    }
  }

  def isBalanced(root: TreeNode): Boolean = {
    import algorithms.easy.tree.MaxDepth.{maxDepth => depth}
    (root == null) || (
      isBalanced(root.left) &&
        isBalanced(root.right) &&
        (depth(root.left) - depth(root.right)).abs <= 1
      )
  }
}
