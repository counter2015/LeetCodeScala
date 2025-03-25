package algorithms.easy.basic

object TwoSum {

  /** Runtime Info: 320 ms, 50.2 MB
    *
    * @param nums
    *   input array
    * @param target
    *   the sum of two element
    * @return
    *   two index in a array, their sum is target
    */
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    require(nums.length >= 2)

    // Data preprocessing, transform data into sorted with index array.
    val arr: IndexedSeq[(Int, Int)] = nums.indices.zip(nums).sortBy(_._2)

    @scala.annotation.tailrec
    def solve(arr: IndexedSeq[(Int, Int)]): Array[Int] = {
      val head = arr.head
      val last = arr.last
      if (head._2 + last._2 == target) {
        Array(head._1, last._1)
      } else if (head._2 + last._2 < target) {
        solve(arr.tail)
      } else {
        solve(arr.init)
      }
    }

    solve(arr)
  }

  /** Runtime info: 308 ms, 51.8MB
    *
    * @param nums
    *   input array
    * @param target
    *   the sum of two element
    * @return
    *   two index in a array, their sum is target
    */
  def twoSumE(nums: Array[Int], target: Int): Array[Int] = {
    import scala.collection.immutable.HashMap
    var map = HashMap.empty[Int, Int]
    var indexa = -1
    var indexb = -1
    for (i <- nums.indices)
      if (map.contains(target - nums(i))) {
        indexa = i
        indexb = map(target - nums(i))
      } else {
        map += nums(i) -> i
      }
    Array(indexa, indexb)
  }

}
