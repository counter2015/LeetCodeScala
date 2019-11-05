package algorithms.easy.basic

import algorithms.struct.ListNode

object RemoveDuplicatesList {

  /** RunTime Info:
    * 296 ms, 51.2 MB
    *
    * @param head first node the list
    * @return the distinct ListNode
    */
  def deleteDuplicates(head: ListNode): ListNode = {
    var h = head
    val dummy = new ListNode(-1)
    var nodes = dummy
    if (head == null || head.next == null) return head
    while (h != null) {
      val n = h
      nodes.next = n
      nodes = nodes.next
      while (h != null && n.x == h.x) h = h.next
    }
    nodes.next = null
    dummy.next
  }
}
