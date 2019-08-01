package algorithms.easy.basic

object TwoSum {
  def twoSum(nums: Array[Int], target: Int): Array[Int] = {
    require(nums.length >= 2)

    // Data preprocessing, transform data into sorted with index array.
    val arr: IndexedSeq[(Int, Int)] = nums.indices.zip(nums).sortBy(_._2)

    def solve(arr: IndexedSeq[(Int, Int)]) : Array[Int] = {
      val head = arr.head
      val last = arr.last
      if (head._2 + last._2 == target) Array(head._1, last._1)
      else if (head._2 + last._2 < target) solve(arr.tail)
      else solve(arr.init)
    }

    solve(arr)
  }
}
