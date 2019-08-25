package algorithms.struct

trait ListNodeTest {
  def printListNodesData(node: ListNode): Unit = {
    val a = Array.empty[Int].toBuffer
    var n = node
    while (n != null) {
      a += n.x
      n = n.next
    }
    println(a.mkString(" "))
  }

  def generateListNodesWithData(arr: Array[Int]): ListNode = {
    if (arr.length == 0) return null
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
