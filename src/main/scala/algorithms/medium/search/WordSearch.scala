package algorithms.medium.search

object WordSearch {

  /** RunTime Info: 488 ms, 59.3 MB
    *
    * @param board
    *   the character board
    * @param word
    *   the string to search
    * @return
    *   whether the string can be find in the board or not
    */
  def exist(board: Array[Array[Char]], word: String): Boolean = {
    val m = board.length
    val n = board.head.length
    val visit = Array.fill(m, n)(false)

    def travel(x: Int, y: Int, target: String): Boolean = {
      if (target.isEmpty) return true
      val (h, t) = (target.head, target.tail)
      if (board(x)(y) != h) {
        false
      } else {
        if (t.isEmpty) return true
        val dx = Array(0, 1, 0, -1)
        val dy = Array(1, 0, -1, 0)
        for (i <- dx.indices) {
          val vx = x + dx(i)
          val vy = y + dy(i)
          if (vx >= 0 && vx < m && vy >= 0 && vy < n && !visit(vx)(vy)) {
            visit(vx)(vy) = true
            if (travel(vx, vy, t)) return true
            visit(vx)(vy) = false
          }
        }
        false
      }
    }

    var res = false
    for (i <- 0 until m; j <- 0 until n) {
      visit(i)(j) = true
      res = res || travel(i, j, word)
      visit(i)(j) = false
    }
    res
  }
}
