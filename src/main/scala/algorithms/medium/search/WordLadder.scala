package algorithms.medium.search

object WordLadder {

  /** RunTime Info: 2024 ms, 58.7 MB
    *
    * @param beginWord
    *   the word begin
    * @param endWord
    *   the word end
    * @param wordList
    *   the word list
    * @return
    *   minimum transform action steps from begin word to end word
    */
  def ladderLength(beginWord: String, endWord: String, wordList: List[String]): Int = {
    import scala.collection.mutable
    def isNear(s1: String, s2: String): Boolean = {
      var count = 0
      if (s1.length != s2.length) return false
      for (i <- 0 until s1.length) {
        if (s1(i) != s2(i)) count += 1
        if (count > 1) return false
      }
      count == 1
    }

    val neighbourLookup = (beginWord :: wordList).map(s => s -> wordList.filter(t => isNear(s, t))).toMap
    val visited = mutable.Map[String, Boolean]().withDefaultValue(false)
    val queue = mutable.Queue(beginWord)
    var depth = 1
    while (queue.nonEmpty) {
      for (_ <- queue.indices) {
        val current = queue.dequeue()
        if (current == endWord) return depth
        visited(current) = true
        queue.enqueueAll(neighbourLookup(current).filterNot(visited))
      }
      depth += 1
    }
    0
  }
}
