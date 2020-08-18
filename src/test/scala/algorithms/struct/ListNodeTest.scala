package algorithms.struct

trait ListNodeTest {

  def elements(node: ListNode): List[Int] = {
    val a = Array.empty[Int].toBuffer
    var n = node
    while (n != null) {
      a += n.x
      n = n.next
    }
    a.toList
  }

  def printListNodesData(node: ListNode): Unit = {
    println(elements(node).mkString(" "))
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

  def generateCycleListNodesWithData(arr: Array[Int], index: Int): ListNode = {
    if (index == -1) return generateListNodesWithData(arr)
    if (arr.length == 0) return null
    val l = arr.map(new ListNode(_))
    for (i <- 1 until arr.length)
      l(i - 1).next = l(i)
    l.last.next = l(index)
    l.head
  }
}
