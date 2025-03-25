package algorithms.hard.tree

import algorithms.struct.TreeNode

object PostorderTraversal {

  /** RunTime Info: 908 ms, 62.3 MB
    *
    * @param root
    *   the root node of the tree
    * @return
    *   the post order of the tree
    */
  def postorderTraversal(root: TreeNode): List[Int] =
    if (root == null) Nil
    else postorderTraversal(root.left) ++ postorderTraversal(root.right) :+ root.value

  /** RunTime Info: 792 ms, 66.3 MB
    *
    * @param root
    *   the root node of the tree
    * @return
    *   the post order of the tree
    */
  def postorderTraversal2(root: TreeNode): List[Int] = {
    import scala.collection.mutable
    val s = mutable.Stack[TreeNode]()
    val res = mutable.ListBuffer[Int]()
    if (root == null) return res.toList
    s.push(root, root)
    while (s.nonEmpty) {
      val node = s.pop()
      if (s.nonEmpty && node == s.top) {
        if (node.right != null)
          s.push(node.right, node.right)
        if (node.left != null)
          s.push(node.left, node.left)
      } else {
        res += node.value
      }
    }
    res.toList
  }
}
