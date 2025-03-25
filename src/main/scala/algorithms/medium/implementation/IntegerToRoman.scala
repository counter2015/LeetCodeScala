package algorithms.medium.implementation

object IntegerToRoman {

  /** RunTime Info: 316 ms, 50.5 MB
    *
    * @param num
    *   input integer
    * @return
    *   roman string which stand for input integer
    */
  def intToRoman(num: Int): String =
    num.toString
      .foldLeft(Array[Any]()) { (res, char) =>
        val newRes = res.map {
          case 'I' => 'X'
          case 'V' => 'L'
          case 'X' => 'C'
          case 'L' => 'D'
          case 'C' => 'M'
        }

        val appendArray = (char match {
          case '1' => "I"
          case '2' => "II"
          case '3' => "III"
          case '4' => "IV"
          case '5' => "V"
          case '6' => "VI"
          case '7' => "VII"
          case '8' => "VIII"
          case '9' => "IX"
          case '0' => ""
        }).toArray

        newRes ++ appendArray
      }
      .mkString
}
