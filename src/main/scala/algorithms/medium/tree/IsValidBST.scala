package algorithms.medium.tree

import algorithms.struct.TreeNode

object IsValidBST {
  def visistNode(root: TreeNode): List[Int] = {
    var res: List[Int] = List()
    var stack: List[TreeNode] = List()
    var node = root
    while (node != null || stack.nonEmpty) {
      while (node != null) {
        stack = stack :+ node
        node = node.left
      }
      val nd = stack.last
      res = res :+ nd.value
      stack = stack.dropRight(1)
      node = nd.right
    }
    res
  }

  /** RunTime Info: 1420ms, 52.7MB
    *
    * @param root
    *   the root node of Tree
    * @return
    *   check whether the tree is valid BST
    */
  def isValidBST(root: TreeNode): Boolean = {
    if (root == null) return true
    val ans = visistNode(root)
    if (ans.length == 1) return true
    var pre = ans.head
    for (i <- 1 until ans.length) {
      if (pre >= ans(i)) return false
      pre = ans(i)
    }
    true
  }
}
