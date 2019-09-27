package algorithms.hard.implementation

object InsertInterval {

  /** RunTime Info:
    * 388 ms, 61 MB
    *
    * @param intervals   [l, r] Array
    * @param newInterval [l, r]
    * @return
    */
  def insert(intervals: Array[Array[Int]], newInterval: Array[Int]): Array[Array[Int]] = {

    if (newInterval.length == 0) return intervals
    if (intervals.flatten.length == 0) return Array(newInterval)

    def insertIt(data: List[List[Int]], insert: List[Int]): List[List[Int]] = {
      data match {
        case Nil => List(List(insert.head, insert.last))
        case head :: tail =>
          val (l, r) = (insert.head, insert.last)
          val (node_l, node_r) = (head.head, head.last)
          if (node_r < l) head :: insertIt(tail, insert)
          else if (node_l > r) insert :: data
          else {
            val newInsert = List(math.min(data.head.head, insert.head), math.max(data.head.last, insert.last))
            insertIt(data.tail, newInsert)
          }
      }
    }

    insertIt(intervals.toList.map(_.toList), newInterval.toList).map(_.toArray).toArray
  }
}