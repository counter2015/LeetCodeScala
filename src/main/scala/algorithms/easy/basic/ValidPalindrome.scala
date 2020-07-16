package algorithms.easy.basic

object ValidPalindrome {

  /** RunTime Info:
    * 520 ms, 50.4 MB
    *
    * @param s the string
    * @return whether the string is palindrome or not
    */
  def isPalindrome(s: String): Boolean = {
    val str = s.filter(_.isLetterOrDigit)
    str.map(x => x.toLower).reverse == str.map(x => x.toLower)
  }
}
