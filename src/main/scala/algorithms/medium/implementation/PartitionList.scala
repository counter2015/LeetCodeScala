package algorithms.medium.implementation

import algorithms.struct.ListNode

object PartitionList {

  /** RunTime Info:
    * 300 ms, 49.5 MB
    *
    * @param head first node
    * @param x    the partition value
    * @return partitioned nodes
    */
  def partition(head: ListNode, x: Int): ListNode = {
    if (head == null) return head
    var h = head
    var l = new ListNode(0)
    var r = new ListNode(0)
    var lh = l
    val rh = r
    while (h != null) {
      if (h.x < x) {
        l.next = h
        l = h
      } else {
        r.next = h
        r = h
      }
      h = h.next
    }
    l.next = rh.next
    r.next = null
    lh = lh.next
    lh
  }
}
