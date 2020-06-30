package algorithms.medium.tree

import algorithms.struct.TreeNode

object PathSum2 {

  /** RunTime Info:
    * 940 ms, 85.6 MB
    *
    * @param root the root node of the tree
    * @param sum  the sum value in tree path
    * @return all the path which sum equals input
    */
  def pathSum(root: TreeNode, sum: Int): List[List[Int]] = {
    if (root == null) Nil
    else if (root.left == null && root.right == null) {
      if (root.value == sum) List(List(root.value))
      else Nil
    } else {
      val left = if (root.left == null) Nil else pathSum(root.left, sum - root.value)
      val right = if (root.right == null) Nil else pathSum(root.right, sum - root.value)
      (left ++ right).map(root.value :: _)
    }
  }
}
