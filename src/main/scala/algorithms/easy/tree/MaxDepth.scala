package algorithms.easy.tree

import algorithms.struct.TreeNode

object MaxDepth {

  /** RunTime Info:
    * 484 ms, 51.4 MB
    *
    * @param root the root node of the tree
    * @return depth of the tree
    */
  def maxDepth(root: TreeNode): Int = {
    if (root == null) 0
    else (maxDepth(root.left) max maxDepth(root.right)) + 1
  }
}
