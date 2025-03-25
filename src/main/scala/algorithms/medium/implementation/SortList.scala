package algorithms.medium.implementation

import algorithms.struct.ListNode

object SortList {

  /** RunTime Info: 796 ms, 53 MB
    *
    * @param head
    *   the head node of list
    * @return
    *   sorted list
    */
  def sortList(head: ListNode): ListNode = {
    if (head == null || head.next == null) return head
    var fast = head
    var slow = head
    while (fast.next != null && fast.next.next != null) {
      slow = slow.next
      fast = fast.next.next
    }
    val right = slow.next
    slow.next = null
    val left = head
    var l = sortList(left)
    var r = sortList(right)
    val dummy = new ListNode(0)
    var h = dummy
    while (l != null && r != null)
      if (l.x <= r.x) {
        h.next = l
        l = l.next
        h = h.next
      } else {
        h.next = r
        r = r.next
        h = h.next
      }
    h.next = if (l == null) r else l
    dummy.next
  }

  def sortList2(head: ListNode): ListNode = {
    if (head == null || head.next == null) return head
    val ld, rd = new ListNode(0)
    var (l, r) = (ld, rd)
    val key = head.x
    var node = head.next
    head.next = null
    while (node != null)
      if (key < node.x) {
        r.next = node
        node = node.next
        r = r.next
        r.next = null
      } else {
        l.next = node
        node = node.next
        l = l.next
        l.next = null
      }
    l.next = head
    val left = sortList2(ld.next)
    val right = sortList2(rd.next)
    node = left
    while (node.next != null) node = node.next
    node.next = right
    left
  }
}
