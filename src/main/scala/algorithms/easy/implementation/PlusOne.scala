package algorithms.easy.implementation

object PlusOne {

  /** RunTime Info:
    * 232 ms, 45.6 MB
    *
    * @param digits a array stands for digits
    * @return the result of plus one
    */
  def plusOne(digits: Array[Int]): Array[Int] = {
    (BigInt(digits.mkString) + 1).toString.toArray.map(_ - '0')
  }
}
