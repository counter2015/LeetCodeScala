package algorithms.hard.tree

import algorithms.struct.TreeNode

object MaxPathSum {

  /** RunTime Info: 1532 ms, 360.9 MB
    *
    * @param root
    *   the root node of the tree
    * @return
    *   the maximum path sum
    */
  def maxPathSum(root: TreeNode): Int = {
    var maxSum = 0

    def maxThroughNodeSum(node: TreeNode): Int =
      if (node == null) 0
      else {
        val left = math.max(maxThroughNodeSum(node.left), 0)
        val right = math.max(maxThroughNodeSum(node.right), 0)
        maxSum = math.max(maxSum, left + right + node.value)
        math.max(left, right) + node.value
      }

    maxSum = root.value
    maxThroughNodeSum(root)
    maxSum
  }
}
