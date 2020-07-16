package algorithms.easy.basic

object SellStock {

  /** RunTime Info:
    * 492 ms, 50.9 MB
    *
    * @param prices the prices of days
    * @return the max profit with one transaction
    */
  def maxProfit(prices: Array[Int]): Int = {
    val n = prices.length
    var sell = 0
    var res = 0
    for (i <- n - 1 to 0 by -1) {
      sell = sell max prices(i)
      res = res max (sell - prices(i))
    }
    res
  }
}
