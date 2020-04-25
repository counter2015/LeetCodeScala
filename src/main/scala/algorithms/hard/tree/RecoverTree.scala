package algorithms.hard.tree

import algorithms.struct.TreeNode

import scala.collection.mutable.ArrayBuffer


object RecoverTree {

  /** Run TimeInfo:
    * 592 ms, 54.1 MB
    *
    * @param root the root node of the tree
    */
  def recoverTree(root: TreeNode): Unit = {
    var values: ArrayBuffer[Int] = ArrayBuffer.empty[Int]
    var index = 0

    def visit(node: TreeNode): Unit = {
      if (node != null) {
        visit(node.left)
        values += node.value
        visit(node.right)
      }
    }

    def set(node: TreeNode, values: ArrayBuffer[Int]): Unit = {
      if (node != null) {
        set(node.left, values)
        node.value = values(index)
        index += 1
        set(node.right, values)
      }
    }

    visit(root)
    set(root, values.sorted)
  }
}