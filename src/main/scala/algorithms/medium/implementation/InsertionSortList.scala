package algorithms.medium.implementation

import algorithms.struct.ListNode

object InsertionSortList {

  /** RunTime Info:
    * 604 ms, 51.8 MB
    *
    * @param head the head node of list
    * @return sorted list
    */
  def insertionSortList(head: ListNode): ListNode = {
    if (head == null || head.next == null) return head
    var preInsert = head
    var insert = preInsert.next
    val h = new ListNode(-1)
    h.next = head
    while (insert != null) {
      var i = h
      val n = insert.next
      while (i.next != insert && i.next.x <= insert.x) {
        i = i.next
      }
      if (i.next != insert) {
        preInsert.next = insert.next
        insert.next = i.next
        i.next = insert
        insert = preInsert.next
      } else {
        preInsert = insert
        insert = insert.next
      }
    }
    h.next
  }


}
