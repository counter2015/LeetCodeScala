package algorithms.medium.implementation

import algorithms.struct.ListNode

object ReverseBetween {

  /** RunTime Info: 272 ms, 49.1 MB
    *
    * @param head
    *   the list node head
    * @param m
    *   start index
    * @param n
    *   end index
    * @return
    *   reverse list node from m to n
    */
  def reverseBetween(head: ListNode, m: Int, n: Int): ListNode = {
    val newHead = new ListNode(0)
    var dummy = newHead
    var i = 1
    var h = head
    while (i < m && h != null) {
      dummy.next = h
      dummy = dummy.next
      h = h.next
      i += 1
    }

    val reverseNodes = new ListNode(0)
    var lastReverseNode: ListNode = null
    while (i <= n && h != null) {
      val nextNode = h.next
      if (lastReverseNode == null) lastReverseNode = h
      h.next = reverseNodes.next
      reverseNodes.next = h
      h = nextNode
      i += 1
    }

    dummy.next = reverseNodes.next
    if (h != null && lastReverseNode != null) {
      lastReverseNode.next = h
    }
    newHead.next
  }
}
