package algorithms.easy.implementation

object MergeSortedArray {

  /** RunTime Info:
    * 268 ms, 48.9 MB
    *
    * @param nums1 first sorted array
    * @param m     the first array length
    * @param nums2 second sorted array
    * @param n     the second array length
    */
  def merge(nums1: Array[Int], m: Int, nums2: Array[Int], n: Int): Unit = {
    var (i, j, c) = (m, n, m + n - 1)
    while (i > 0 && j > 0) {
      if (nums1(i - 1) > nums2(j - 1)) {
        nums1(c) = nums1(i - 1)
        i -= 1
        c -= 1
      } else {
        nums1(c) = nums2(j - 1)
        j -= 1
        c -= 1
      }
    }
    while (j > 0) {
      nums1(c) = nums2(j - 1)
      c -= 1
      j -= 1
    }

  }
}
