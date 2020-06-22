package algorithms.easy.tree

import algorithms.struct.TreeNode

object ArrayToBST {

  /** RunTime Info:
    * 900 ms, 57.8 MB
    *
    * @param nums a sorted array
    * @return constructed Binary Sorted Tree in which the depth
    *         of the two subtrees of *every* node never differ by more than 1
    */
  def sortedArrayToBST(nums: Array[Int]): TreeNode = {
    if (nums.length == 0) null
    else {
      val mid = nums.length / 2
      val node = new TreeNode(nums(mid))
      node.left = sortedArrayToBST(nums.slice(0, mid))
      node.right = sortedArrayToBST(nums.slice(mid + 1, nums.length))
      node
    }
  }
}
