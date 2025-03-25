package algorithms.medium.basic

import algorithms.struct.{RandomListNode => Node}

import scala.collection.mutable

object CopyRandomList {

  /** RunTime Info: 500 ms, 52.1 MB
    *
    * @param head
    *   node of random list
    * @return
    *   deep copy of original list
    */
  def copyRandomList(head: Node): Node = {
    if (head == null) return null

    val map = mutable.Map[Node, Node]().withDefaultValue(null)
    var node = head
    while (node != null) {
      map(node) = new Node(node.value)
      node = node.next
    }
    node = head
    while (node != null) {
      map(node).next = map(node.next)
      map(node).random = map(node.random)
      node = node.next
    }
    map(head)
  }
}
