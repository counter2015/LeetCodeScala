package algorithms.medium.basic

object CompareVersion {

  /** RunTime Info:
    * 440 ms, 49.8 MB
    *
    * @param version1 the version1 string
    * @param version2 the version2 string
    * @return the version compare result
    */
  def compareVersion(version1: String, version2: String): Int = {
    def convert(version: String): Array[Int] = {
      version.split("\\.").map(_.toInt)
    }

    val (vs1, vs2) = (convert(version1), convert(version2))

    val n = vs1.length min vs2.length
    for (i <- 0 until n) {
      if (vs1(i) < vs2(i)) return -1
      else if (vs1(i) > vs2(i)) return 1
    }

    if (vs1.length > n) {
      if ((n until vs1.length).forall(i => vs1(i) == 0)) 0 else 1
    } else if (vs2.length > n) {
      if ((n until vs2.length).forall(i => vs2(i) == 0)) 0 else -1
    } else 0
  }
}
