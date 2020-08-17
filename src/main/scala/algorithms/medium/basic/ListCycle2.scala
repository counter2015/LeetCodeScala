package algorithms.medium.basic

import algorithms.struct.ListNode

object ListCycle2 {

  /** RunTime Info:
    * 516 ms, 50.9 MB
    *
    * @param head the head node of the list
    * @return the gate node of cycle
    */
  def detectCycle(head: ListNode): ListNode = {
    if (head == null) return null
    var fast, slow: ListNode = head
    while (fast.next != null && fast.next.next != null) {
      fast = fast.next.next
      slow = slow.next
      if (fast == slow) {
        slow = head
        while (fast != slow) {
          fast = fast.next
          slow = slow.next
        }
        return slow
      }
    }
    null
  }
}
