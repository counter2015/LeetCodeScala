package algorithms.hard.implementation

object LongestConsecutive {

  /** RunTime Info: 892 ms, 67.9 MB
    *
    * @param nums
    *   the integer array
    * @return
    *   longest consecutive sequence length
    */
  def longestConsecutive(nums: Array[Int]): Int = {
    import scala.collection.mutable
    val set = mutable.Set(nums.toIndexedSeq: _*)
    var res = 0
    for (n <- nums)
      if (set.contains(n)) {
        var temp = 1
        var (i, j) = (n - 1, n + 1)
        set.remove(n)
        while (set.contains(i) || set.contains(j)) {
          if (set.contains(i)) {
            set.remove(i)
            temp += 1
            i -= 1

          }

          if (set.contains(j)) {
            set.remove(j)
            temp += 1
            j += 1
          }
        }
        res = res max temp
      }
    res
  }
}
