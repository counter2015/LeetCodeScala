package algorithms.easy.basic

import algorithms.struct.ListNode

object InsertionNode {

  /** RunTime Info: 556 ms, 55.3 MB
    *
    * @param headA
    *   head of list node A
    * @param headB
    *   head of list node B
    * @return
    *   the insertion node or null
    */
  def getIntersectionNode(headA: ListNode, headB: ListNode): ListNode = {
    def listLength(l: ListNode): Int =
      if (l == null) 0 else 1 + listLength(l.next)

    val (a, b) = (listLength(headA), listLength(headB))
    var (x, y) = (headA, headB)
    var c = if (a > b) {
      a - b
    } else {
      x = headB
      y = headA
      b - a
    }

    while (c > 0) {
      c -= 1
      x = x.next
    }

    while (x != null) {
      if (x == y) return x
      x = x.next
      y = y.next
    }
    null
  }

}
