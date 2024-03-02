package algorithms.medium.math

object RecurringDecimal {

  /** RunTime Info:
    * 536 ms, 54.6 MB
    *
    * @param numerator
    * @param denominator
    * @return the (recurring) decimal string
    */
  def fractionToDecimal(numerator: Int, denominator: Int): String = {
    val sign = if (numerator.toLong * denominator.toLong < 0) "-" else ""
    val d = math.abs(denominator.toLong)
    val pointLeftPart = math.abs(numerator.toLong) / d

    var n = math.abs(numerator.toLong) % d

    def insertOnString(str: String, index: Int, newString: String): String = {
      str.substring(0, index) + newString + str.substring(index)
    }

    val decimalMap = collection.mutable.Map.empty[Long, Int]
    var pointRightPart = ""
    var index = 0
    var break = false

    while (n != 0 && !break) {
      n = n * 10
      var i = n / d

      if (decimalMap.contains(n)) {
        pointRightPart = insertOnString(pointRightPart, decimalMap(n), "(") + ")"
        break = true
      } else {
        decimalMap.put(n, index)
        index += 1
        pointRightPart += i
      }

      n %= d


    }

    val res = if (pointRightPart == "") pointLeftPart.toString
    else s"$pointLeftPart.$pointRightPart"

    sign + res
  }

}
