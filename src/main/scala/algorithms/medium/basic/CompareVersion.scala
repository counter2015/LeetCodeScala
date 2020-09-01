package algorithms.medium.basic

object CompareVersion {

  /** RunTime Info:
    * 708 ms, 49.9 MB
    *
    * @param version1 the version1 string
    * @param version2 the version2 string
    * @return the version compare result
    */
  def compareVersion(version1: String, version2: String): Int = {
    def convert(version: String): List[Int] = {
      version.split("\\.").map(_.toInt).toList
    }

    implicit def orderingList[A](implicit ord: Ordering[A]): Ordering[List[A]] =
      new Ordering[List[A]] {
        @scala.annotation.tailrec
        def compare(xs: List[A], ys: List[A]): Int =
          (xs, ys) match {
            case (x :: xsTail, y :: ysTail) =>
              val c = ord.compare(x, y)
              if (c != 0) c else compare(xsTail, ysTail)
            case (Nil, Nil) => 0
            case (r, Nil) => if (r.forall(_ == 0)) 0 else 1
            case (Nil, r) => if (r.forall(_ == 0)) 0 else -1
          }
      }

    val (vs1, vs2) = (convert(version1), convert(version2))
    implicitly[Ordering[List[Int]]].compare(vs1, vs2)
  }
}
