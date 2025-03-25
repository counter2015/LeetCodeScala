package algorithms.hard.tree

import algorithms.struct.TreeNode

import scala.collection.mutable.ArrayBuffer

object RecoverTree {

  /** Run TimeInfo: 592 ms, 54.1 MB
    *
    * @param root
    *   the root node of the tree
    */
  def recoverTree(root: TreeNode): Unit = {
    var values: ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    var index = 0

    def visit(node: TreeNode): Unit =
      if (node != null) {
        visit(node.left)
        values += node.value
        visit(node.right)
      }

    def set(node: TreeNode, values: ArrayBuffer[Int]): Unit =
      if (node != null) {
        set(node.left, values)
        node.value = values(index)
        index += 1
        set(node.right, values)
      }

    visit(root)
    set(root, values.sorted)
  }

  /** RunTime Info: 628 ms, 52.4 MB
    *
    * @param root
    *   the root node of the tree
    */
  def morrisSolution(root: TreeNode): Unit = {
    var first, second, cur: TreeNode = root

    var pre: TreeNode = null
    var isFisrtMeet = true

    @scala.annotation.tailrec
    def morrisInOrderTraversal(node: TreeNode): Unit = {
      def findLessNode(_n: TreeNode): TreeNode = {
        var n = _n
        while (n.right != null && n.right != cur) n = n.right
        n
      }

      def check(): Unit =
        if (pre != null && cur != null && pre.value > cur.value) {
          if (isFisrtMeet) {
            isFisrtMeet = !isFisrtMeet
            first = pre
            second = cur
          } else second = cur
        }

      if (node != null) {
        if (node.left == null) {
          check()
          pre = cur
          cur = node.right
        } else {
          val less = findLessNode(node.left)
          if (less.right == null) {
            less.right = node
            cur = node.left
          } else if (less.right == node) {
            check()
            less.right = null
            pre = cur
            cur = node.right
          }
        }
        morrisInOrderTraversal(cur)
      }
    }

    morrisInOrderTraversal(root)

    if (second != null) {
      val temp = first.value
      first.value = second.value
      second.value = temp
    }
  }
}
