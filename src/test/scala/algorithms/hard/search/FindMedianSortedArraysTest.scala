package algorithms.hard.search

import algorithms.hard.search.FindMedianSortedArrays.{findMedianSortedArrays => solve}
import org.scalatest.FunSuite

class FindMedianSortedArraysTest extends FunSuite {

  test("test0: sample input") {
    val nums1 = Array(1, 3)
    val nums2 = Array(2)
    assert(solve(nums1, nums2) == 2.0)
  }

  test("test1: sample input") {
    val nums1 = Array(1, 2)
    val nums2 = Array(3, 4)
    assert(solve(nums1, nums2) == 2.5)
  }

  test("test2: first array is empty") {
    val nums1 = Array.empty[Int]
    val nums2 = Array(1)
    assert(solve(nums1, nums2) == 1.0)
  }

  test("test3: last array is empty") {
    val nums1 = Array(3)
    val nums2 = Array.empty[Int]
    assert(solve(nums1, nums2) == 3.0)
  }
}
