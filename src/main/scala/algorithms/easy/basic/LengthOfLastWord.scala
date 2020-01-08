package algorithms.easy.basic

object LengthOfLastWord {

  /** RunTime Info:
    * 240 ms, 44.2 MB
    *
    * @param s input string
    * @return length of last word
    */
  def lengthOfLastWord(s: String): Int = {
    if (s.filter(_ != ' ').length == 0) 0 else s.split(" ").last.length
  }
}
