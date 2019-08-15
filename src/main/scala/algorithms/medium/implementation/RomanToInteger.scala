package algorithms.medium.implementation

object RomanToInteger {

  /** RunTime Info:
    * 284 ms, 51.9 MB
    *
    * @param s input Roman string
    * @return the integer which stand for input Roman string
    */
  def romanToInt(s: String): Int = {

    def convert(c: Char): Int = c match {
      case 'I' => 1
      case 'V' => 5
      case 'X' => 10
      case 'L' => 50
      case 'C' => 100
      case 'D' => 500
      case 'M' => 1000
    }

    def travel(s: String): Int = {
      if (s.length == 0) 0
      else if (s.length == 1) convert(s.head)
      else {
        val (a, b) = (convert(s(0)), convert(s(1)))
        if (a < b) travel(s.substring(2)) + b - a
        else travel(s.substring(1)) + a
      }
    }

    travel(s)
  }
}
