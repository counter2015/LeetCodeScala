package algorithms.medium.tree

import algorithms.struct.TreeNode

object PostInOrderBuild {

  /** RunTime Info: 620 ms, 70.2 MB
    *
    * @param inorder
    *   the inorder of the tree
    * @param postorder
    *   the postorder of the tree
    * @return
    *   the tree
    */
  def buildTree(inorder: Array[Int], postorder: Array[Int]): TreeNode =
    if (postorder.isEmpty || inorder.isEmpty) null
    else {
      val root = new TreeNode(postorder.last)
      val index = inorder.indexOf(root.value)
      val (leftInorder, rightInorder) = (inorder.slice(0, index), inorder.slice(index + 1, inorder.length))
      val leftLength = leftInorder.length
      val rightLength = rightInorder.length
      root.left = buildTree(leftInorder, postorder.slice(0, leftLength))
      root.right = buildTree(rightInorder, postorder.slice(leftLength, postorder.length - 1))
      root
    }
}
