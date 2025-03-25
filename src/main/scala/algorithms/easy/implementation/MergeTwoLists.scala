package algorithms.easy.implementation

import algorithms.struct.ListNode

object MergeTwoLists {

  /** RunTime Info: 276 ms, 49.6 MB
    *
    * @param l1
    *   first sorted ListNode
    * @param l2
    *   second sorted ListNode
    * @return
    *   merged ListNode
    */
  def mergeTwoLists(l1: ListNode, l2: ListNode): ListNode = {
    val res = new ListNode(0)
    var dummy = res
    var a = l1
    var b = l2
    while (a != null && b != null)
      if (a.x < b.x) {
        dummy.next = new ListNode(a.x)
        dummy = dummy.next
        a = a.next
      } else {
        dummy.next = new ListNode(b.x)
        dummy = dummy.next
        b = b.next
      }

    while (a != null) {
      dummy.next = new ListNode(a.x)
      dummy = dummy.next
      a = a.next
    }

    while (b != null) {
      dummy.next = new ListNode(b.x)
      dummy = dummy.next
      b = b.next
    }

    res.next
  }
}
