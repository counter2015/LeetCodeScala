package algorithms.medium.basic

object LetterCombinations {

  /** RunTime Info:
    * 240 ms, 44.8 MB
    *
    * the phone number and character show as following:
    *
    * 1  2  3          "null"  abc   def
    * 4  5  6    -----> ghi    jkl   mno
    * 7  8  9           oprs   tuv   wxyz
    *
    * @param digits input digits on the phone
    * @return all the string according to the input digits
    */
  def letterCombinations(digits: String): List[String] = {
    def convert(c: Char): String = c match {
      case '2' => "abc"
      case '3' => "def"
      case '4' => "ghi"
      case '5' => "jkl"
      case '6' => "mno"
      case '7' => "pqrs"
      case '8' => "tuv"
      case '9' => "wxyz"
    }

    if (digits.length == 0) return Nil
    val str = digits.map(convert _).toArray

    var res = List[String]()

    def travel(str: Array[String], headStr: String): Unit = {
      if (str.length == 0) {
        res = headStr :: res
      } else {
        for (c <- str.head)
          travel(str.tail, headStr + c)
      }
    }

    travel(str, "")

    res
  }
}
