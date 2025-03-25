package algorithms.easy.basic

import algorithms.struct.ListNode

object ListCycle {

  /** RunTime Info: 484 ms, 50.7 MB
    *
    * @param head
    *   the head node of list
    * @return
    *   whether the list nodes have cycle
    */
  def hasCycle(head: ListNode): Boolean =
    if (head == null) false
    else {
      var fast = head
      var slow = head
      while (fast.next != null && fast.next.next != null) {
        fast = fast.next.next
        slow = slow.next
        if (fast == slow) return true
      }
      false
    }
}
