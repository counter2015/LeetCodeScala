package algorithms.medium.tree

import algorithms.struct.TreeNode

object PreInOrderBuild {

  /** RunTime Info:
    * 668 ms, 80.1 MB
    *
    * @param preorder the preorder of the tree
    * @param inorder  the inorder of the tree
    * @return the tree
    */
  def buildTree(preorder: Array[Int], inorder: Array[Int]): TreeNode = {
    if (preorder.isEmpty || inorder.isEmpty) null
    else {
      val root = new TreeNode(preorder.head)
      val index = inorder.indexOf(root.value)
      val (leftInorder, rightInorder) = (inorder.slice(0, index), inorder.slice(index + 1, inorder.length))
      val leftLength = leftInorder.length
      root.left = buildTree(preorder.slice(1, 1 + leftLength), leftInorder)
      root.right = buildTree(preorder.slice(1 + leftLength, preorder.length), rightInorder)
      root
    }
  }
}
