package algorithms.medium.regex

object StringToInteger {

  /** RunTime Info:
    * 320 ms, 47 MB
    *
    * @param str a crazy input string
    * @return 0, Integer.MAX_VALUE, Integer.MIN_VALUE or a Integer depends your crazy input
    */
  def myAtoi(str: String): Int = {
    val pattern = " *([+-])?(\\d+).*".r

    str match {
      case pattern(sign, num) =>
        val bigInt = if (sign == "-") -BigInt(num) else BigInt(num)
        if (bigInt > Integer.MAX_VALUE) {
          Integer.MAX_VALUE
        } else if (bigInt < Integer.MIN_VALUE) {
          Integer.MIN_VALUE
        } else {
          bigInt.toInt
        }
      case _ => 0
    }
  }
}
