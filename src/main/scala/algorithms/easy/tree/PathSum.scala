package algorithms.easy.tree

import algorithms.struct.TreeNode

object PathSum {

  /** RunTime Info: 548 ms, 52 MB
    *
    * @param root
    *   the root node of the tree
    * @param sum
    *   the sum value in tree path
    * @return
    *   whether exist such a path whose sum equals input
    */
  def hasPathSum(root: TreeNode, sum: Int): Boolean =
    if (root == null) false
    else {
      (root.left, root.right) match {
        case (null, null) =>
          root.value == sum
        case (null, right) =>
          hasPathSum(right, sum - root.value)
        case (left, null) =>
          hasPathSum(left, sum - root.value)
        case (left, right) =>
          hasPathSum(left, sum - root.value) || hasPathSum(right, sum - root.value)
      }
    }
}
