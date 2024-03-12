package algorithms.easy.basic

object ExcelSheetColumnTitle {

  /** Runtime Info:
    * 495 ms, 53.32 MB
    *
    * @param columnNumber
    * @return the 26 radix-string
    */
  def convertToTitle(columnNumber: Int): String = {
    val radix = 26

    @scala.annotation.tailrec
    def calcTitle(n: Int, res: String = ""): String = {
      if (n > radix) {
        val r = n % radix
        if (r != 0) {
          calcTitle((n - r) / radix, ('A' + r - 1).toChar.toString + res)
        } else {
          calcTitle(n / radix - 1, "Z" + res)
        }
      } else {
        ('A' + n - 1).toChar.toString + res
      }
    }

    calcTitle(columnNumber)
  }
}
