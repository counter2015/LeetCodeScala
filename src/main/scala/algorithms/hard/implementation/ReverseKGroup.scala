package algorithms.hard.implementation

import algorithms.struct.ListNode

object ReverseKGroup {

  /** RunTime Info: 484 ms, 53.6 MB
    *
    * @param head
    *   head node of ListNode
    * @param k
    *   the number to reverse
    * @return
    *   ListNode reversed by number `k`
    */
  def reverseKGroup(head: ListNode, k: Int): ListNode = {
    val dummy = new ListNode(0)
    var res = dummy
    var node = head
    var cnt = 0

    while (node != null) {
      var buf = node
      while (cnt < k && buf != null) {
        buf = buf.next
        cnt += 1
      }

      if (cnt == k) {

        cnt = 0
        var nextNode = new ListNode(0)
        while (cnt < k) {
          nextNode = node.next
          node.next = res.next
          res.next = node
          node = nextNode
          cnt += 1
        }
        while (res.next != null) res = res.next
      } else {
        res.next = node
        while (node != null) node = node.next
      }
      cnt = 0
    }
    dummy.next
  }
}
