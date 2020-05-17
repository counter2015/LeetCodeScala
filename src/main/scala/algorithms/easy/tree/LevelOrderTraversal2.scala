package algorithms.easy.tree

import algorithms.struct.TreeNode

object LevelOrderTraversal2 {
  def levelOrder(root: TreeNode): List[List[Int]] = {
    def visit(level: List[TreeNode]): List[List[Int]] = {
      val nextLevel = level.flatMap(node => Seq(node.left, node.right)).filter(_ != null)
      (level.length.compare(0), nextLevel.length.compare(0)) match {
        case (1, 0) => List(level.map(_.value))
        case (1, 1) => List(level.map(_.value)) ::: visit(nextLevel)
        case _ => Nil
      }
    }

    if (root == null) Nil
    else visit(List[TreeNode](root))
  }

  /** RunTime Info:
    * 644 ms, 70.4 MB
    *
    * @param root the root node of the tree
    * @return from bottom levelOrder
    */
  def levelOrderBottom(root: TreeNode): List[List[Int]] = {
    levelOrder(root).reverse
  }
}
