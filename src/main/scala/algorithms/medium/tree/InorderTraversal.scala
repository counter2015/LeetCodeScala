package algorithms.medium.tree

import algorithms.struct.TreeNode

import scala.collection.mutable.ListBuffer

object InorderTraversal {

  /** RunTime Info:
    * 236 ms, 43.9 MB
    *
    * @param root , the root node of tree
    * @return the in order traversal list of tree
    */
  def inorderTraversal(root: TreeNode): List[Int] = {
    var ans: ListBuffer[Int] = new ListBuffer[Int]()

    def travel(node: TreeNode): Unit = {
      if (node != null) {
        if (node.left != null) travel(node.left)
        ans += node.value
        if (node.right != null) travel(node.right)
      }
    }

    travel(root)
    ans.toList
  }

  /** RunTime Info:
    * 268 ms, 44.1 MB
    *
    * @param root , the root node of tree
    * @return the in order traversal list of tree
    */
  def inorderTraversal2(root: TreeNode): List[Int] = {
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
}
