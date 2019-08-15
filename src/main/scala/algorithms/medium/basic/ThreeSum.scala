package algorithms.medium.basic

object ThreeSum {

  /** RunTime Info:
    * 6548 ms, 88.3 MB
    *
    * @param nums input integer array
    * @return the result list tuple(a,b,c) that a + b + c == 0
    */
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    import scala.collection.mutable.ArrayBuffer

    val arr = nums.sorted


    var res = ArrayBuffer.empty[List[Int]]
    var a = 0
    while (a < arr.length - 2) {
      var (b, c) = (a + 1, arr.length - 1)
      while (b < c) {
        val sum = arr(a) + arr(b) + arr(c)
        if (sum == 0) {
          res += List(arr(a), arr(b), arr(c))
          while (b < c && arr(b) == arr(b + 1)) b += 1
          while (b < c && arr(c) == arr(c - 1)) c -= 1
          b += 1
          c -= 1
        } else if (sum < 0) b += 1
        else c -= 1
      }
      while (a + 1 < arr.length - 2 && arr(a) == arr(a + 1)) a += 1
      a += 1
    }
    res.toList
  }
}
