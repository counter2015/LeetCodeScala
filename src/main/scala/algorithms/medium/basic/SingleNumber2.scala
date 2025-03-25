package algorithms.medium.basic

object SingleNumber2 {

  /** RunTime Info: 680 ms, 55.3 MB
    *
    * @param nums
    *   the array of numbers
    * @return
    *   the single number
    */
  def singleNumber(nums: Array[Int]): Int = {
    def bitAdd(a: String, b: String): String = {
      val res = for (i <- 0 until 32) yield (a(i).asDigit + b(i).asDigit) % 3
      res.mkString
    }

    val res = nums.map(x => x.toBinaryString.reverse.padTo(32, '0').reverse).reduceLeft(bitAdd)

    def strConvert(str: String): Int =
      if (str.head == '1') {
        val s = str.map(x => ('0' + (1 - (x - '0'))).toChar).toCharArray
        var cin = '1'
        var i = 31
        do {
          (cin, s(i)) match {
            case ('1', '1') =>
              cin = '1'
              s(i) = '0'
            case ('1', '0') =>
              cin = '0'
              s(i) = '1'
            case _ => ()
          }
          i -= 1
        } while (cin == '1' && i >= 0)
        -Integer.parseUnsignedInt(s.mkString, 2)
      } else Integer.parseUnsignedInt(str, 2)

    strConvert(res)
  }
}
