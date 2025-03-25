package algorithms.hard.implementation

import algorithms.struct.ListNode

object MergeKLists {

  /** RunTime Info: 1072 ms, 61.7 MB
    *
    * @param lists
    *   input ListNodes that are sorted
    * @return
    *   a sorted ListNode
    */
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    var tlists = lists.filter(_ != null).toBuffer
    val res = new ListNode(-1)
    var cur = res

    while (tlists.nonEmpty) {

      val n = tlists.length
      var minIndex = 0
      var minValue = Int.MaxValue
      for (i <- 0 until n)
        if (minValue > tlists(i).x) {
          minIndex = i
          minValue = tlists(i).x
        }

      cur.next = tlists(minIndex)
      cur = cur.next

      tlists(minIndex) = tlists(minIndex).next
      if (tlists(minIndex) == null) tlists.remove(minIndex)
    }

    res.next
  }
}
