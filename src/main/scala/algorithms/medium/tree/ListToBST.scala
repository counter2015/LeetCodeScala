package algorithms.medium.tree

import algorithms.struct.{ListNode, TreeNode}

object ListToBST {

  /** RunTime Info:
    * 1832 ms, 59.8 MB
    *
    * @param head head node of ListNodes
    * @return constructed Binary Sorted Tree in which the depth
    *         of the two subtrees of *every* node never differ by more than 1
    */
  def sortedListToBST(head: ListNode): TreeNode = {
    import scala.collection.mutable.ArrayBuffer
    val arr = ArrayBuffer[Int]()
    var node = head
    while (node != null) {
      arr += node.x
      node = node.next
    }


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

    sortedArrayToBST(arr.toArray)
  }
}
