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

  /** RunTime Info:
    * 552 ms, 53.4 MB
    *
    * @param prices the prices of days
    * @return the max profit with at most two transaction
    */
  def maxProfitBetter(prices: Array[Int]): Int = {
    if (prices.isEmpty) 0
    else {
      val leftProfits = prices.foldLeft((List.empty[Int], prices.head)) {
        case ((acc, min), price) =>
          val lastProfit = acc.headOption.getOrElse(0)
          val profit = lastProfit.max(price - min)
          val newMin = min.min(price)
          (profit :: acc, newMin)
      }._1

      val rightProfits = prices.foldRight((List.empty[Int], prices.last)) {
        case (price, (acc, max)) =>
          val lastProfit = acc.headOption.getOrElse(0)
          val profit = lastProfit.max(max - price)
          val newMax = max.max(price)
          (profit :: acc, newMax)
      }._1.reverse

      leftProfits.zip(rightProfits).map { case (left, right) => left + right }.max
    }
  }
}
