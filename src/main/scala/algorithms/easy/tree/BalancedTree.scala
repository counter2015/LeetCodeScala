package algorithms.easy.tree

import algorithms.struct.TreeNode

object BalancedTree {

  /** RunTime Info:
    * 564 ms, 51.4 MB
    *
    * @param root the root node of the tree
    * @return whether the tree is balanced of not
    */
  def isBalanced(root: TreeNode): Boolean = {
    def depth(root: TreeNode): Int = {
      if (root == null) 0
      else (depth(root.left) max depth(root.right)) + 1
    }

    (root == null) || (
      isBalanced(root.left) &&
        isBalanced(root.right) &&
        (depth(root.left) - depth(root.right)).abs <= 1
      )
  }
}
