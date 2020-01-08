package algorithms.medium.implementation

import scala.collection.mutable.ArrayBuffer

object MergeIntervals {

  /** RunTime Info:
    * 436ms, 64.2MB
    *
    * @param intervals List of integer array
    * @return merged list of integer array
    */
  def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {
    if (intervals.flatten.length == 0) return intervals

    val data = intervals.map(r => (r(0), r(1))).sortBy(r => (r._1, r._2))(Ordering.Tuple2(Ordering.Int, Ordering.Int))

    def travel(data: List[(Int, Int)], l: Int, r: Int): List[(Int, Int)] = {
      data match {
        case Nil =>
          List((l, r))
        case head :: tail =>
          val (node_l, node_r) = (head._1, head._2)
          if (node_l <= r && node_l >= l) {
            travel(tail, l, math.max(node_r, r))
          } else {
            (l, r) :: travel(tail, node_l, node_r)
          }
      }
    }

    travel(data.toList, data.head._1, data.head._2).map(x => Array(x._1, x._2)).toArray
  }

  /** RunTime Info:
    * 416ms, 56.7MB
    *
    * @param intervals List of integer array
    * @return merged list of integer array
    */
  def mergeImperative(intervals: Array[Array[Int]]): Array[Array[Int]] = {
    if (intervals.flatten.length == 0) return intervals

    val data = intervals.map(r => (r(0), r(1))).sortBy(r => (r._1, r._2))(Ordering.Tuple2(Ordering.Int, Ordering.Int))
    var L = data(0)._1
    var R = data(0)._2
    val res = ArrayBuffer.empty[(Int, Int)]
    for ((l, r) <- data.tail) {
      if (l <= R && l >= L) {
        R = math.max(R, r)
      }
      else {
        res += ((L, R))
        L = l
        R = r
      }
    }
    res += ((L, R))
    res.toArray.map(x => Array(x._1, x._2))
  }
}
