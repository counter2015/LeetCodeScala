package algorithms.hard.search


object WordLadder2 {

  import scala.collection.mutable.ListBuffer

  /** RunTime Info:
    * 1160 ms, 61.5MB
    *
    * @param beginWord the word begin
    * @param endWord   the word end
    * @param wordList  the word list
    * @return the shortest transform path from begin word to end word
    */
  def findLadders(beginWord: String, endWord: String, wordList: List[String]): List[List[String]] = {

    // https://leetcode.com/problems/word-ladder-ii/discuss/121099/simple-scala-solution
    val wordSet: Set[String] = wordList.toSet
    val prevMap: scala.collection.mutable.Map[String, List[String]] = scala.collection.mutable.Map[String, List[String]]()
    val distance: scala.collection.mutable.Map[String, Int] = scala.collection.mutable.Map[String, Int]()

    bfs(beginWord, endWord, wordSet, prevMap, distance)

    val result = ListBuffer[List[String]]()
    val list = ListBuffer[String]()
    generatePaths(prevMap.toMap, beginWord, endWord, list, result, distance.toMap)
    result.map(_.reverse).toList
  }


  def bfs(beginWord: String, endWord: String, wordSet: Set[String], prevMap: scala.collection.mutable.Map[String, List[String]],
          distance: scala.collection.mutable.Map[String, Int]): Unit = {
    val seen: scala.collection.mutable.Set[String] = scala.collection.mutable.Set()
    val queue = scala.collection.mutable.Queue[String]()

    queue.enqueue(beginWord)
    distance.put(beginWord, 0)

    while (queue.nonEmpty) {
      val word = queue.dequeue()
      if (!seen.contains(word)) {
        seen.add(word)
        if (word == endWord) return
        val neighbors = getNeighbors(word, wordSet)
        for (neighbor <- neighbors) {
          if (!seen.contains(neighbor)) {
            if (!distance.contains(neighbor)) distance.put(neighbor, distance(word) + 1)
            queue.enqueue(neighbor)
            val wordList: List[String] =
              if (prevMap.contains(neighbor))
                prevMap(neighbor) ++ List(word)
              else
                List(word)
            prevMap.put(neighbor, wordList)
          }
        }
      }
    }
  }

  def generatePaths(prevMap: Map[String, List[String]],
                    beginWord: String,
                    endWord: String,
                    list: ListBuffer[String],
                    result: ListBuffer[List[String]],
                    distance: Map[String, Int]): Unit = {
    if (endWord == beginWord) {
      list.append(endWord)
      result.append(list.toList)
      list.remove(list.length - 1)
      return
    }

    if (prevMap.contains(endWord)) {
      list.append(endWord)
      for (word <- prevMap(endWord)) {
        if (distance(word) + 1 == distance(endWord)) {
          // this is the magic to pick shortest paths only, only take nodes that are only one step further from you when compared to the start node
          generatePaths(prevMap, beginWord, word, list, result, distance)
        }
      }
      list.remove(list.length - 1)
    }
  }

  def getNeighbors(word: String, wordSet: Set[String]): List[String] = {
    val neighbors = scala.collection.mutable.ListBuffer[String]()
    word.zipWithIndex.foreach {
      case (c, i) =>
        val newCharArry = word.toCharArray
        val temp = newCharArry(i)
        for (ch <- 'a' to 'z') {
          newCharArry(i) = ch
          val newStr = newCharArry.mkString
          if (wordSet.contains(newStr) && ch != temp) {
            neighbors += newStr
          }
        }
        newCharArry(i) = temp
    }
    neighbors.toList
  }
}

