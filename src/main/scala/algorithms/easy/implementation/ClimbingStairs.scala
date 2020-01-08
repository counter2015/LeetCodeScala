package algorithms.easy.implementation

object ClimbingStairs {

  /** RunTime Info:
    * 192 ms, 39 MB
    *
    * @param n stairs number
    * @return the number of climbing solutions
    */
  def climbStairs(n: Int): Int = {
    def fib(n: Int): Int = {
      @scala.annotation.tailrec
      def solve(n: Int, a1: Int = 1, a2: Int = 2): Int = {
        if (n == 0) a1 else solve(n - 1, a2, a1 + a2)
      }

      solve(n)
    }

    fib(n - 1)
  }
}
