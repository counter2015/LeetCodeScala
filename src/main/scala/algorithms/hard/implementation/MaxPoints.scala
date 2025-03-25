package algorithms.hard.implementation

object MaxPoints {

  /** RunTime Info: 700 ms, 51 MB
    *
    * @param points
    *   teh points
    * @return
    *   the max points number in one line
    */
  def maxPoints(points: Array[Array[Int]]): Int = {
    case class Point(_x: Int, _y: Int) {
      def x: Long = _x.toLong

      def y: Long = _y.toLong
    }
    def oneLine(p1: Point, p2: Point, p3: Point): Boolean = {
      val (x1, y1, x2, y2, x3, y3) = (p1.x, p1.y, p2.x, p2.y, p3.x, p3.y)
      x1 * y3 + x2 * y1 + x3 * y2 == x1 * y2 + x2 * y3 + x3 * y1
    }

    var res = 0
    val ps = for (p <- points if p.length == 2) yield Point(p(0), p(1))
    for (i <- ps; j <- ps if i != j)
      res = res max ps.count(p => oneLine(i, j, p))
    if (res == 0) {
      if (ps.distinct.length == 1) ps.length else 2 min ps.length
    } else res
  }
}
