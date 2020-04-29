package algorithms.medium.tree

import algorithms.struct.TreeNode

object LevelOrderTraversal {

  /** RunTime Info:
    * 508 ms, 51.4 MB
    *
    * @param root the root node of tree
    * @return Level Order Traversal of the tree
    */
  def levelOrder(root: TreeNode): List[List[Int]] = {
    def visit(level: List[TreeNode]): List[List[Int]] = {
      val nextLevel = level.flatMap(node => Seq(node.left, node.right)).filter(_ != null)
      (level.length.compare(0), nextLevel.length.compare(0)) match {
        case (1, 0) => List(level.map(_.value))
        case (1, 1) => List(level.map(_.value)) ::: visit(nextLevel)
        case _ => Nil
      }
    }

    if (root == null) Nil else visit(List(root))
  }
}
