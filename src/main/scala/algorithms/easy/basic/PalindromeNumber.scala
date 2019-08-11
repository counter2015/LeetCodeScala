package algorithms.easy.basic

object PalindromeNumber {

  /** RunTime Info:
    * 292 ms, 46.7 MB
    *
    * @param x input integer
    * @return check the integer is palindrome or not
    */
  def isPalindrome(x: Int): Boolean = {
    x.toString.reverse == x.toString
  }
}
