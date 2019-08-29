package algorithms.easy.implementation

object RemoveElement {

  /** RunTime Info:
    * 244 ms, 44.6 MB
    *
    * @param nums  input array
    * @param `val` element need to be remove
    * @return remain length of array
    */
  def removeElement(nums: Array[Int], `val`: Int): Int = {
    val arr = nums.filterNot(_ == `val`)
    arr.indices.foreach(i => nums(i) = arr(i))
    arr.length
  }
}
