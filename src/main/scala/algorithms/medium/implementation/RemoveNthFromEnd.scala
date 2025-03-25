package algorithms.medium.implementation

import algorithms.struct.ListNode

object RemoveNthFromEnd {

  /** RunTime Info: 276 ms, 46.3MB
    *
    * @param head
    *   first node of ListNodes
    * @param n
    *   the remove index from tail
    * @return
    *   ListNodes' head which have remove element
    */
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {

    var dummy = new ListNode(-1)
    val res = dummy

    var length = 1
    var it = head
    while (it.next != null) {
      it = it.next
      length += 1
    }

    var index = 0
    it = head
    while (index < length - n) {
      dummy.next = it
      dummy = dummy.next
      it = it.next
      index = index + 1
    }

    dummy.next = it.next
    res.next
  }
}
