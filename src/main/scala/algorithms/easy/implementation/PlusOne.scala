package algorithms.easy.implementation

object PlusOne {

  /** RunTime Info: 232 ms, 45.6 MB
    *
    * @param digits
    *   a array stands for digits
    * @return
    *   the result of plus one
    */
  def plusOneOld(digits: Array[Int]): Array[Int] =
    // see: https://leetcode.com/problems/plus-one/discuss/399291/scala-one-linealmost/792716
    (BigInt(digits.mkString) + 1).toString.toArray.map(_ - '0')

  /** RunTime Info: 468 ms, 51.3 MB
    *
    * @param digits
    *   a array stands for digits
    * @return
    *   the result of plus one
    */
  def plusOne(digits: Array[Int]): Array[Int] =
    if (digits.forall(_ == 0)) digits.init :+ 1
    else (BigInt(digits.mkString) + 1).toString.toArray.map(_ - '0')
}
