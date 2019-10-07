package algorithms.hard.implementation

import scala.util.{Failure, Success, Try}

object ValidNumber {

  /** RunTime Info:
    * 292 ms, 45.2 MB
    *
    * @param s a string
    * @return whether the string is a number or not
    */
  def isNumber(s: String): Boolean = {
    Try(s.toDouble) match {
      case Success(_) =>
        s.filter(_.isLetter).forall(_.toLower == 'e')
      case Failure(_) => false
    }
  }
}
