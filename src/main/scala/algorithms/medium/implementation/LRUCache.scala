package algorithms.medium.implementation

class LRUCache(_capacity: Int) {

  import scala.collection.mutable

  private var size = 0
  private val INF = -1
  private var head = Node(INF, INF)
  private var tail = Node(INF, INF)
  head.next = tail
  tail.pre = head

  private val data: mutable.Map[Int, Node] = mutable.Map[Int, Node]()

  case class Node(key: Int, value: Int, var pre: Node = null, var next: Node = null)

  private def insertToHead(n: Node): Unit = {
    head.next.pre = n
    n.next = head.next
    n.pre = head
    head.next = n
  }

  private def remove(n: Node): Unit = {
    n.pre.next = n.next
    n.next.pre = n.pre
  }

  def get(key: Int): Int = {
    val node = data.getOrElse(key, Node(INF, INF))
    if (node.value != INF) {
      remove(node)
      insertToHead(node)
      node.value
    } else INF
  }

  def put(key: Int, value: Int): Unit = {
    val node = data.get(key) match {
      case Some(node) =>
        remove(node)
        node.copy(value = value)
      case None =>
        if (_capacity == size) {
          data -= tail.pre.key
          remove(tail.pre)
        } else {
          size += 1
        }
        Node(key, value)
    }
    insertToHead(node)
    data += (key -> node)
  }
}
