package algorithms.hard.implementation


object SellStock3 {

  /** RunTime Info:
    * 2560 ms, 713.9 MB
    *
    * @param prices the prices of days
    * @return the max profit with at most two transaction
    */
  def maxProfit(prices: Array[Int]): Int = {

    def maxProfitOne(prices: Array[Int]): Int = {
      val n = prices.length
      var sell = 0
      var res = 0
      for (i <- n - 1 to 0 by -1) {
        sell = sell max prices(i)
        res = res max (sell - prices(i))
      }
      res
    }

    var res = 0
    val n = prices.length
    for (splitPos <- 0 until n) {
      res = res max (maxProfitOne(prices.slice(0, splitPos)) + maxProfitOne(prices.slice(splitPos, n)))
    }
    res
  }
}
