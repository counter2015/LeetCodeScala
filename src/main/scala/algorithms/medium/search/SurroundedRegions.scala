package algorithms.medium.search

object SurroundedRegions {

  /** RunTime Info:
    * 576 ms, 54.1 MB
    *
    * @param board the board
    */
  def solve(board: Array[Array[Char]]): Unit = {
    if (board.isEmpty) return
    val m = board.length
    val n = board.head.length
    val visit = Array.fill(m, n)(false)

    val steps = Array((0, 1), (1, 0), (0, -1), (-1, 0))

    def check(x: Int, y: Int): Boolean =
      x >= 0 && x < m && y >= 0 && y < n

    def dfs(x: Int, y: Int): Unit = {
      if (!visit(x)(y)) {
        visit(x)(y) = true
        for ((dx, dy) <- steps if check(x + dx, y + dy)) {
          if (board(dx + x)(dy + y) == 'O') {
            dfs(dx + x, dy + y)
          }
        }
      }
    }

    for (i <- 0 until m; j <- 0 until n
         if i == 0 || i == m - 1 || j == 0 || j == n - 1) {
      if (board(i)(j) == 'O') {
        dfs(i, j)
      }
    }

    for (i <- 0 until m; j <- 0 until n) {
      board(i)(j) = if (visit(i)(j)) board(i)(j) else 'X'
    }
  }
}
