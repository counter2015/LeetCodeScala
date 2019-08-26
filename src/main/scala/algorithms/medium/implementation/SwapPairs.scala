package algorithms.medium.implementation

import algorithms.struct.ListNode

object SwapPairs {

  /** RunTime Info:
    * 248 ms, 46.7 MB
    *
    * @param head the head node of ListNode
    * @return ListNode after swap of pairs
    */
  def swapPairs(head: ListNode): ListNode = {

    @scala.annotation.tailrec
    def travel(pre: ListNode, node: ListNode): Unit = {
      if (pre == null) ()
      else if (node == null || node.next == null) pre.next = node
      else {
        val a = node
        val b = node.next
        val nextNode = b.next
        pre.next = b
        b.next = a
        a.next = nextNode
        travel(a, nextNode)
      }
    }

    val dummy = new ListNode(0)
    travel(dummy, head)
    dummy.next
  }
}
