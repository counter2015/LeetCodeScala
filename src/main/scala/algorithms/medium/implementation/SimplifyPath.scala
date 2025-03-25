package algorithms.medium.implementation

object SimplifyPath {

  /** RunTime Info: 312 ms, 50.3 MB
    *
    * @param path
    *   the file path
    * @return
    *   teh simplified file path
    */
  def simplifyPath(path: String): String = {
    val raw = path.split("/").filter(_.length > 0).filter(_ != ".")
    val ans = raw.foldLeft(Vector.empty[String])((res, cur) =>
      cur match {
        case ".." => if (res.length > 1) res.init else Vector.empty[String]
        case _    => res :+ cur
      }
    )
    "/" + ans.mkString("/")
  }
}
