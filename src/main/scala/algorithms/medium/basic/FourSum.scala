package algorithms.medium.basic

object FourSum {

  /** RunTime Info:
    * 360 ms, 53.7MB
    *
    * @param nums   integer array
    * @param target integer
    * @return the result list tuple(a,b,c,d) that a + b + c + d == target
    */
  def fourSum(nums: Array[Int], target: Int): List[List[Int]] = {

    import scala.collection.mutable.ArrayBuffer

    val arr = nums.sorted
    var res = ArrayBuffer.empty[List[Int]]
    var a = 0
    val n = arr.length
    while (a < n - 3) {
      if (a == 0 || arr(a) != arr(a - 1)) {
        var b = a + 1
        while (b < n - 2) {
          if (b == a + 1 || arr(b) != arr(b - 1)) {
            var (c, d) = (b + 1, n - 1)
            while (c < d) {
              val sum = arr(a) + arr(b) + arr(c) + arr(d)
              if (sum == target) {
                res += List(arr(a), arr(b), arr(c), arr(d))
                while (c < d && arr(c) == arr(c + 1)) c += 1
                while (c < d && arr(d) == arr(d - 1)) d -= 1
                c += 1
                d -= 1
              } else if (sum < target) c += 1
              else d -= 1
            }
          }
          while (b + 1 < n - 2 && arr(b) == arr(b + 1)) b += 1
          b += 1
        }
      }
      while (a + 1 < n - 3 && arr(a) == arr(a + 1)) a += 1
      a += 1
    }
    res.toList
  }
}
