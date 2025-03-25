package algorithms.easy.implementation

object StrStr {

  /** RunTime Info: 236 ms, 44.2 MB
    *
    * @param haystack
    *   source string
    * @param needle
    *   target string
    * @return
    *   index of target string, or -1 if not found , or 0 if needle.length == 0
    */
  def strStr(haystack: String, needle: String): Int =
    haystack.indexOf(needle)
}
