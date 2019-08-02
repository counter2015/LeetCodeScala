package algorithms.medium.string


object LengthOfLongestSubstring {

  // 876 ms, 53.5 MB
  def lengthOfLongestSubstring(s: String): Int = {

    def travels(index: Int, current: Int, result: Int, curString: Map[Char, Int]): Int = {
      if (index >= s.length) return math.max(current, result)
      val ch = s(index)
      if (curString.contains(ch))
        travels(curString(ch) + 1, 0, math.max(result, current), Map.empty[Char, Int])
      else
        travels(index + 1, current + 1, result, curString + (ch -> index))
    }

    travels(0, 0, 0, Map.empty[Char, Int])
  }
}
