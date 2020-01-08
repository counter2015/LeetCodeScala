package algorithms.medium.basic

import algorithms.struct.ListNode

object RemoveDuplicatesList2 {

  /** RunTime Info:
    * 332 ms, 50.9 MB
    *
    * @param head first node the list
    * @return the distinct ListNode
    */
  def deleteDuplicates(head: ListNode): ListNode = {
    var h = head
    val dummy = new ListNode(-1)
    var nodes = dummy

    if (head == null || head.next == null) {
      head
    }
    else {
      while (h != null && h.next != null) {
        val (a, b) = (h, h.next)
        if (a.x == b.x) {
          while (h != null && h.x == a.x) h = h.next
        } else {
          nodes.next = a
          nodes = nodes.next
          h = h.next
        }
      }
      if (h != null && h.next == null) {
        nodes.next = h
        nodes = nodes.next
      }
      nodes.next = null
      dummy.next
    }

  }
}
