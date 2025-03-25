package algorithms.hard.search

object FindMedianSortedArrays {

  /** RunTime Info: 440ms, 62.5MB
    *
    * @param nums1
    *   first input array
    * @param nums2
    *   second input array
    * @return
    */
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    val (a, b) = if (nums1.length > nums2.length) (nums2, nums1) else (nums1, nums2)
    val (m, n) = (a.length, b.length)

    @scala.annotation.tailrec
    def search(result: Double, iLeft: Int, iRight: Int): Double = {
      if (iLeft > iRight) return result
      val i = (iLeft + iRight) / 2
      val j = (m + n + 1) / 2 - i
      if (i < iRight && j > 0 && a(i) < b(j - 1)) {
        search(result, i + 1, iRight)
      } else if (i > iLeft && j < n && b(j) < a(i - 1)) {
        search(result, iLeft, i - 1)
      } else {
        val maxLeft =
          if (i == 0) b(j - 1) else if (j == 0) a(i - 1) else math.max(a(i - 1), b(j - 1))

        val minRight =
          if (i == m) b(j) else if (j == n) a(i) else math.min(a(i), b(j))

        val result = if ((m + n) % 2 == 1) maxLeft else (maxLeft + minRight) / 2.0
        // exit search
        search(result, 0, -1)
      }
    }

    if (a.length == 0) (b((n - 1) / 2) + b(n / 2)) / 2.0 else search(0.0, 0, m)
  }
}
