package algorithms.hard.string

object WordBreak2 {

  /** RunTime Info: 700 ms, 63.8 MB
    *
    * @param s
    *   the target string
    * @param wordDict
    *   the words
    * @return
    *   all sequence words
    */
  def wordBreak(s: String, wordDict: List[String]): List[String] = {
    case class Memo[A, B](f: A => B) extends (A => B) {

      import scala.collection.mutable

      private val cache = mutable.Map.empty[A, B]

      def apply(x: A): B = cache.getOrElseUpdate(x, f(x))
    }
    lazy val f: Memo[String, List[String]] = Memo {
      case "" => List[String]("")
      case x: String =>
        wordDict.foldLeft(List[String]()) { (l, w) =>
          if (x.endsWith(w)) {
            l ::: f(x.dropRight(w.length)).map(str => if (str.nonEmpty) str + " " + w else w)
          } else l
        }
    }
    f(s)
  }
}
