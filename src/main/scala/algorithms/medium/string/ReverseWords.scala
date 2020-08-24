package algorithms.medium.string

object ReverseWords {

  /** RunTime Info:
    * 1760 ms, 51.1 MB
    *
    * @param s input string
    * @return the string whose words reversed
    */
  def reverseWords(s: String): String = {
    s.trim.split(" ").filter(_.length > 0).reverse.mkString(" ")
  }
}
