package algorithms.medium.basic

import algorithms.struct.ListNode

object ReorderList {

  /** RunTime Info:
    * 892 ms, 53.6 MB
    *
    * @param head the head node of list
    */
  def reorderList(head: ListNode): Unit = {
    if (head == null || head.next == null || head.next.next == null) return
    var l = head
    var r = head

    while (r.next != null && r.next.next != null) {
      l = l.next
      r = r.next.next
    }

    val dummy = new ListNode(-1)
    var h = l.next
    while (h != null) {
      val insert = h
      h = h.next
      insert.next = dummy.next
      dummy.next = insert
    }
    r = dummy.next
    l.next = null
    l = head
    var last: ListNode = null
    while (r != null && l != null) {

      val (templ, tempr) = (l.next, r.next)
      // insert node r between l and l.next
      r.next = l.next
      l.next = r

      last = r
      l = templ
      r = tempr
    }
    if (r != null) last.next = r
  }
}
