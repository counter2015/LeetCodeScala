package algorithms.easy.implementation

object AddBinary {

  /** RunTime Info: 260 ms, 48.5 MB
    *
    * @param a
    *   binary string
    * @param b
    *   binary string
    * @return
    *   result of binary string `a` + `b`
    */
  def addBinary(a: String, b: String): String =
    (BigInt.apply(a, 2) + BigInt.apply(b, 2)).toString(2)
}
