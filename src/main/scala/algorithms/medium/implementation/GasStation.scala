package algorithms.medium.implementation

object GasStation {

  /** RunTime Info:
    * 644 ms, 51 MB
    *
    * @param gas  the gas volume of each station
    * @param cost cost of each edge between neighbor gas station
    * @return the start index of gas station
    */
  def canCompleteCircuit(gas: Array[Int], cost: Array[Int]): Int = {
    val arr = gas.zip(cost).map(x => x._1 - x._2)
    var res = -1
    val n = arr.length

    def travel(index: Int): Boolean = {
      var cnt = 0
      var g = 0
      while (cnt < n) {
        g += arr((cnt + index) % n)
        if (g < 0) return false
        cnt += 1
      }
      true
    }

    for (i <- 0 until n if arr(i) >= 0) {
      if (travel(i)) res = i
    }
    res
  }
}
