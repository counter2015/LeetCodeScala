package algorithms.easy.basic

object SellStock2 {

  /** RunTime Info:
    * 532 ms, 51.1 MB
    *
    * @param prices the prices of days
    * @return the max profit with multiple transaction
    */
  def maxProfit(prices: Array[Int]): Int = {
    val n = prices.length
    var res = 0
    var last = prices(0)
    for (i <- 0 until n - 1 if prices(i) > prices(i + 1)) {
      res += prices(i) - last
      last = prices(i + 1)
    }
    res += prices(n - 1) - last
    res
  }
}
