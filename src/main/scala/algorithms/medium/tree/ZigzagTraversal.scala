package algorithms.medium.tree

import algorithms.struct.TreeNode

object ZigzagTraversal {

  /** RunTime Info:
    * 496 ms, 51.2 MB
    *
    * @param root the root node of the tree
    * @return the zigzagLevelOrder traversal result
    */
  def zigzagLevelOrder(root: TreeNode): List[List[Int]] = {
    def visit(level: List[TreeNode], isOddLevel: Boolean = false): List[List[Int]] = {
      val nextLevel = level.flatMap(node => Seq(node.left, node.right)).filter(_ != null)
      (level.length.compare(0), nextLevel.length.compare(0)) match {
        case (1, 0) =>
          if (isOddLevel)
            List(level.map(_.value).reverse)
          else
            List(level.map(_.value))
        case (1, 1) =>
          if (isOddLevel)
            List(level.map(_.value).reverse) ::: visit(nextLevel, !isOddLevel)
          else
            List(level.map(_.value)) ::: visit(nextLevel, !isOddLevel)
        case _ => Nil
      }
    }

    if (root == null) Nil else visit(List(root))
  }
}
