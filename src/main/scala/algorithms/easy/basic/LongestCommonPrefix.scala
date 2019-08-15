package algorithms.easy.basic

object LongestCommonPrefix {

  /** RunTime Info:
    * 244 ms, 44.8 MB
    *
    * @param strs a string array
    * @return the longest common prefix string the input Array[string]
    */
  def longestCommonPrefix(strs: Array[String]): String = {
    if (strs.length == 0) return ""
    val length = strs.map(_.length).min
    val num = strs.length
    for (l <- 0 until length; n <- 1 until num) {
      if (strs(n - 1)(l) != strs(n)(l)) return strs(0).slice(0, l)
    }
    strs(0).slice(0, length)
  }
}
