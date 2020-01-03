package algorithms.medium.implementation

import scala.collection.mutable.ListBuffer

object RestoreIpAddresses {

  /** RunTime Info:
    * 292 ms, 48.8 MB
    *
    * @param s source string with only digits
    * @return valid ip address list
    */
  def restoreIpAddresses(s: String): List[String] = {

    val res = ListBuffer[String]()

    def travel(index: Int, remainMatch: Int, cur: ListBuffer[String]): Unit = {
      if (remainMatch == 0) {
        if (s.length == index) res += cur.mkString(".")
      } else if (index < s.length) {
        val ns =
          (1 to 3).map(i => s.slice(index, index + i))
            .filterNot(x => x.length == 0 || (x.length > 1 && x.startsWith("0")))
            .filter(x => x.toInt <= 255 && x.toInt >= 0)

        ns.foreach(str => {
          travel(index + str.length, remainMatch - 1, cur :+ str)
        })
      }
    }

    travel(0, 4, ListBuffer())
    res.toList.distinct
  }
}
