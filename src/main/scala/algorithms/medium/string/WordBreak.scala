package algorithms.medium.string

object WordBreak {

  /** RunTime Info:
    * 688 ms, 64.5 MB
    *
    * @param s        the target string
    * @param wordDict the words
    * @return whether the string can be split to words
    */
  def wordBreak(s: String, wordDict: List[String]): Boolean = {
    (0 to s.length).foldLeft(List(0))((res, i) => {
      if (res.exists(x => wordDict.contains(s.slice(x, i)))) i :: res else res
    }).max == s.length
  }
}
