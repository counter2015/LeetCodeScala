package algorithms.easy.tree

import algorithms.struct.TreeNode

object SymmetricTree {

  /** RunTime Info:
    * 516 ms, 51 MB
    *
    * @param root the root node of the tree
    * @return whether the tree is symmetric
    */
  def isSymmetric(root: TreeNode): Boolean = {
    def check(node1: TreeNode, node2: TreeNode): Boolean = {
      if (node1 == null && node2 == null) true
      else if (node1 == null || node2 == null) false
      else if (node1.value != node2.value) false
      else check(node1.left, node2.right) && check(node1.right, node2.left)
    }

    check(root, root)
  }

  /** RunTime Info:
    * 484 ms, 53 MB
    *
    * @param root the root node of the tree
    * @return whether the tree is symmetric
    */
  def isSymmetric2(root: TreeNode): Boolean = {
    def check(node1: TreeNode, node2: TreeNode): Boolean = {
      import scala.collection.mutable
      val q1, q2 = mutable.Queue[TreeNode]()
      q1.enqueue(node1)
      q2.enqueue(node2)
      while (q1.nonEmpty && q2.nonEmpty) {
        val (t1, t2) = (q1.dequeue(), q2.dequeue())
        if (t1 != null || t2 != null) {
          if (t1 == null || t2 == null) return false
          else if (t1.value != t2.value) return false
          q1.enqueue(t1.left)
          q1.enqueue(t1.right)
          q2.enqueue(t2.right)
          q2.enqueue(t2.left)
        }
      }
      !(q1.nonEmpty || q2.nonEmpty)
    }

    root == null || check(root.left, root.right)
  }
}
