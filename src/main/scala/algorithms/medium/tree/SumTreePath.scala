package algorithms.medium.tree

import algorithms.struct.TreeNode

object SumTreePath {

  /** RunTime Info: 488 ms, 50.4 MB
    *
    * @param root
    *   the root of the tree
    * @return
    *   the sum of all paths
    */
  def sumNumbers(root: TreeNode): Int = {
    def sum(node: TreeNode, parents: List[Int]): List[Int] = {
      @inline def isLeaf(n: TreeNode): Boolean =
        node.right == null && node.left == null

      if (isLeaf(node)) List((parents :+ node.value).mkString.toInt)
      else {
        val l = if (node.left == null) Nil else sum(node.left, parents :+ node.value)
        val r = if (node.right == null) Nil else sum(node.right, parents :+ node.value)
        l ++ r
      }
    }

    if (root == null) 0
    else sum(root, List[Int]()).sum
  }
}
