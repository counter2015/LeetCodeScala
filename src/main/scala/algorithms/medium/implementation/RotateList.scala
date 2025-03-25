package algorithms.medium.implementation

import algorithms.struct.ListNode

object RotateList {

  /** RunTime Info: 316 ms, 51.2 MB
    *
    * @param head
    *   the head of ListNodes
    * @param k
    *   the rotate number
    * @return
    *   the rotated ListNodes
    */
  def rotateRight(head: ListNode, k: Int): ListNode = {
    import scala.collection.mutable.ArrayBuffer
    var length = 0
    var temp = head
    val buf = ArrayBuffer[Int]()
    while (temp != null) {
      buf += temp._x
      temp = temp.next
      length += 1
    }
    if (length == 0) return null
    val x = k % length

    val res = (buf.takeRight(x) ++ buf.take(length - x)).map(node => new ListNode(node))

    var listNode = res.head
    val newHead = listNode
    for (i <- 1 until length) {
      listNode.next = res(i)
      listNode = listNode.next
    }
    newHead
  }

}
