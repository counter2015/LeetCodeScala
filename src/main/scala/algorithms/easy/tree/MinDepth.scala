package algorithms.easy.tree

import algorithms.struct.TreeNode

object MinDepth {

  /** RunTime Info:
    * 548 ms, 51.6 MB
    *
    * @param root the root node of the tree
    * @return min depth of all the leaves
    */
  def minDepth(root: TreeNode): Int = {
    if (root == null) 0
    else if (root.left == null || root.right == null) 1
    else {
      val l = if (root.left != null) minDepth(root.left) else Int.MaxValue
      val r = if (root.right != null) minDepth(root.right) else Int.MaxValue
      math.min(l, r) + 1
    }
  }

}
