package algorithms.hard.implementation

object TextJustification {

  /** RunTime Info: 244 ms, 46.2 MB
    *
    * @param words
    *   words string in array
    * @param maxWidth
    *   the max width of each line
    * @return
    *   fixed lines with max width
    */
  def fullJustify(words: Array[String], maxWidth: Int): List[String] = {
    val l = words.mkString.length + words.length - 1
    val Space = " "
    if (l <= maxWidth) {
      val temp = words.mkString(" ")
      val res = temp + Space * (maxWidth - temp.length)
      List(res)
    } else {
      var len = 0
      var index = 0
      var raw = ""
      while (len <= maxWidth)
        if (len == 0) {
          len = words(index).length
          raw = words(index)
          index += 1
        } else {
          len = len + words(index).length + 1
          if (len <= maxWidth) {
            raw = raw + Space + words(index)
            index += 1
          }
        }

      val headWords = raw.split(Space)
      val lastWords: Array[String] = words.drop(index)
      if (headWords.length > 1) {
        val spaceLength = maxWidth - headWords.mkString.length
        val spaceCount = spaceLength / (headWords.length - 1)
        val moreSpaceCount = spaceLength % (headWords.length - 1)

        val spacesArray =
          List.fill(moreSpaceCount)(spaceCount + 1) ++ List.fill(headWords.length - 1 - moreSpaceCount)(spaceCount)
        val headResult = headWords.head + headWords.tail.zip(spacesArray).map(x => (Space * x._2) + x._1).mkString
        List(headResult) ++ fullJustify(lastWords, maxWidth)
      } else {
        val temp = headWords.mkString
        val res = temp + Space * (maxWidth - temp.length)
        List(res) ++ fullJustify(lastWords, maxWidth)
      }

    }
  }
}
