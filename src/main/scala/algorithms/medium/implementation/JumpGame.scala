package algorithms.medium.implementation

object JumpGame {

  /** RunTime Info: 312 ms, 52.3 MB
    *
    * @param nums
    *   input array
    * @return
    *   whether can jump to last position
    */
  def canJump(nums: Array[Int]): Boolean = {

    @scala.annotation.tailrec
    def check(arr: Array[Int], i: Int, farthest: Int): Boolean = arr match {
      case arr if farthest >= arr.length - 1   => true
      case arr if i == farthest && arr(i) == 0 => false
      case arr                                 => check(arr, i + 1, Math.max(farthest, arr(i) + i))
    }

    check(nums, 0, nums(0))
  }
}
