package algorithms.medium.implementation

import algorithms.struct.ListNode

object AddTwoNumbers {

  // 368 ms, 55.8 MB
  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = {
    var head = new ListNode(0)
    var res = head
    var cin = 0
    var (la, lb) = (l1, l2)
    while (la != null && lb != null) {
      val v = la.x + lb.x + cin
      head.next = new ListNode(v % 10)
      cin = v / 10
      la = la.next
      lb = lb.next
      head = head.next
    }

    var node = if (la == null) lb else la
    while (node != null && cin > 0) {
      val v = node.x + cin
      head.next = new ListNode(v % 10)
      cin = v / 10
      node = node.next
      head = head.next
    }

    if (cin > 0) head.next = new ListNode(cin)
    res.next
  }
}

