package algorithms.medium.tree

import algorithms.struct.TreeNode

object FlattenTree {

  /** RunTime Info: 520 ms, 51 MB
    *
    * @param root
    *   the root node of the tree
    */
  def flatten(root: TreeNode): Unit = {
    @scala.annotation.tailrec
    def rightMostNode(node: TreeNode): TreeNode =
      if (node == null) null
      else if (node.right != null) rightMostNode(node.right)
      else node

    if (root == null || (root.left == null && root.right == null))
      ()
    else if (root.left == null && root.right != null)
      flatten(root.right)
    else if (root.left != null && root.right == null) {
      flatten(root.left)
      root.right = root.left
      root.left = null
    } else {
      flatten(root.left)
      flatten(root.right)
      rightMostNode(root.left).right = root.right
      root.right = root.left
      root.left = null
    }
  }
}
