package algorithms.medium.tree

import algorithms.struct.TreeNode

object PreorderTraversal {

  /** RunTime Info: 452 ms, 50.5 MB
    *
    * @param root
    *   the root node of the tree
    * @return
    *   the preorder traversal of the tree
    */
  def preorderTraversal(root: TreeNode): List[Int] =
    if (root == null)
      Nil
    else
      root.value :: preorderTraversal(root.left) ::: preorderTraversal(root.right)

  /** RunTime Info: 464 ms, 52.5 MB
    *
    * @param root
    *   the root node of the tree
    * @return
    *   the preorder traversal of the tree
    */
  def preorderTraversal2(root: TreeNode): List[Int] = {
    import scala.collection.mutable
    val s = mutable.Stack[TreeNode]()
    val res = mutable.ListBuffer[Int]()
    if (root != null) s.push(root)
    while (s.nonEmpty) {
      val node = s.pop()
      if (node != null) {
        res += node.value
        s.push(node.right)
        s.push(node.left)
      }
    }
    res.toList
  }
}
