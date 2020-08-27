package algorithms.easy.implementation

import scala.collection.mutable

class MinStack {
  private val s = new mutable.Stack[(Int, Int)]()

  def push(x: Int): Unit = {
    val min = if (s.isEmpty) x else s.top._2 min x
    s.push((x, min))
  }

  def pop(): Unit = {
    if (s.isEmpty) throw new java.util.NoSuchElementException
    else s.pop()
  }

  def top(): Int = {
    if (s.isEmpty) throw new java.util.NoSuchElementException
    else s.top._1
  }

  def getMin: Int = {
    if (s.isEmpty) throw new java.util.NoSuchElementException
    else s.top._2
  }
}
