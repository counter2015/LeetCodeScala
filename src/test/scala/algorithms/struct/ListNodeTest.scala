package algorithms.struct

trait ListNodeTest {
  def generateListNodesWithData(arr: Array[Int]): ListNode = {
    val l = arr.map(new ListNode(_))
    for (i <- 1 until arr.length)
      l(i - 1).next = l(i)

    l.head
  }

  def sameElement(a: ListNode, b: ListNode): Boolean = {
    if (a == null && b == null) true
    else if (a != null && b != null) {
      a.x == b.x && sameElement(a.next, b.next)
    } else false
  }
}
