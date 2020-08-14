package algorithms.struct

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

trait RandomListNodeTest {

  def generate(data: List[(Int, Option[Int])]): RandomListNode = {
    val map = mutable.Map[Int, RandomListNode]().withDefaultValue(null)

    for (((v, _), i) <- data.zipWithIndex) {
      map(i) = new RandomListNode(v)
    }

    for (((_, n), i) <- data.zipWithIndex) {
      n match {
        case Some(next) =>
          map(i).random = map(next)
        case None => ()
      }
    }

    for (i <- 0 until map.size - 1) {
      map(i).next = map(i + 1)
    }
    map(0)
  }

  def depack(head: RandomListNode): List[(Int, Option[Int])] = {
    case class Data(var value: Int, var random: Int = -1)
    val res = ListBuffer[Data]()
    var node = head


    while (node != null) {
      res += Data(node.value)
      node = node.next
    }
    var i = 0
    node = head
    while (node != null) {
      val target = node.random
      if (target != null) {
        var temp = node
        var offset = 0
        while (temp != null && temp != target) {
          offset += 1
          temp = temp.next
        }
        res(i).random = i + offset
      }
      i += 1
      node = node.next
    }
    res.toList.map(r => {
      r.value -> (if (r.random == -1) None else Some(r.random))
    })
  }
}
