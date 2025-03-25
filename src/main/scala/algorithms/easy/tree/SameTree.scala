package algorithms.easy.tree

import algorithms.struct.TreeNode

object SameTree {

  /** RunTime Info: 852 ms, 61.9 MB
    *
    * @param p
    *   first TreeNode
    * @param q
    *   second TreeNode
    * @return
    *   whether the trees have same struct and value
    */
  def isSameTree(p: TreeNode, q: TreeNode): Boolean =
    (p, q) match {
      case (null, null) => true
      case (null, _)    => false
      case (_, null)    => false
      case (x, y) =>
        x.value == y.value &&
        isSameTree(x.left, y.left) &&
        isSameTree(x.right, y.right)
    }
}
