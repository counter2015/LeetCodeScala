package algorithms.easy.basic

object CountAndSay {

  /** RunTime Info:
    * 268 ms, 48.6 MB
    *
    * @param n the nth String of `CountAndSay`
    * @return the spell string
    */
  def countAndSay(n: Int): String = {

    def spell(str: List[Char]): String = {
      def split[T](list: List[T]): List[List[T]] = list match {
        case Nil => Nil
        case h :: _ =>
          val segment = list.takeWhile {
            h == _
          }
          segment :: split(list.drop(segment.length))
      }

      split(str).map(x => s"${x.length}${x.head}").mkString
    }

    if (n == 1) "1" else spell(countAndSay(n - 1).toList)
  }
}
