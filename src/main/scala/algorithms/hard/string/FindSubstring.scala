package algorithms.hard.string

object FindSubstring {

  /** RunTime Info:
    * 2264 ms, 58.2 MB
    *
    * @param s     source string to search
    * @param words list of target string
    * @return all the index where we can get the concatenation of all the string in `words`
    */
  def findSubstring(s: String, words: Array[String]): List[Int] = {

    def empty(wc: Map[String, Int]): Boolean = wc.keys.forall(wc(_) == 0)

    def travel(wc: Map[String, Int], str: String): Boolean = {
      if (wc.isEmpty || empty(wc)) true
      else if (str.length == 0 || wc.values.sum * wc.keys.head.length > str.length) false
      else {
        wc.keys.filter(key => str.startsWith(key) && wc(key) > 0).map(key => {
          var wcc = wc
          wcc += key -> (wcc(key) - 1)
          travel(wcc, str.substring(key.length))
        }).exists(_ == true)
      }
    }

    @scala.annotation.tailrec
    def getAllIndexes(source: String, target: String, index: Int = 0, res: List[Int]): List[Int] = {
      val targetIndex = source.indexOf(target, index)
      if (targetIndex != -1)
        getAllIndexes(source, target, targetIndex + 1, targetIndex :: res)
      else
        res
    }

    var indexMap = Map.empty[String, List[Int]]
    val wordCount = words.groupBy(identity).toArray.map(x => (x._1, x._2.length)).toMap
    wordCount.foreach(wc => indexMap += (wc._1 -> getAllIndexes(s, wc._1, 0, Nil)))


    indexMap.keys.flatMap(key => {
      var wcClone = wordCount
      wcClone += key -> (wcClone(key) - 1)
      indexMap(key).filter(index => travel(wcClone, s.substring(index + key.length)))
    }).toList
  }
}
