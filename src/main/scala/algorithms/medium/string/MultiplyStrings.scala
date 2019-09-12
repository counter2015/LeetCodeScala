package algorithms.medium.string

object MultiplyStrings {

  /** RunTime Info:
    * 288 ms, 48.9 MB
    *
    * @param num1 string
    * @param num2 string
    * @return the multiply result of two string
    */
  def multiply(num1: String, num2: String): String =
    (BigInt(num1) * BigInt(num2)).toString
}
