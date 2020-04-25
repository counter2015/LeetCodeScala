package algorithms.medium.implementation

object GroupAnagrams {

  /** RunTime info:
    * 1812 ms, 67.7 MB
    *
    * @param strs array of string
    * @return grouped array of string
    */
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    strs.groupBy(_.toSeq.sorted.unwrap).values.map(_.toList).toList
  }
}
