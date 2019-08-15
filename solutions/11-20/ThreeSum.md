#  3Sum

## Problem link
https://leetcode.com/problems/3sum/

## Description
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.


## Example

```
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
```


## Solution
We can first set `a` at [0, n-2],
set`b` at a + 1,
set `c` at n-1

Suppose arr is sorted array from `nums`
let sum = arr(a) + arr(b) + arr(c)
if sum == 0, add (a,b,c) to result list,
if sum < 0, let b = b + 1, and check sum again,
if sum > 0, let c = c - 1, and check sum again.

This solution will cost O(n*n) time.

However, when implement in scala, is much slower,
I guess it's because the `List` append will cost expensive time.
Since following java code just cost 30 ms. 

```java
public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new LinkedList<>();
        for (int i = 0; i < num.length-2; i++) {
            if (i == 0 || (num[i] != num[i-1])) {
                int left = i+1, right = num.length-1, sum = 0 - num[i];
                while (left < right) {
                    if (num[left] + num[right] == sum) {
                        res.add(Arrays.asList(num[i], num[left], num[right]));
                        while (left < right && num[left] == num[left+1]) left++;
                        while (left < right && num[right] == num[right-1]) right--;
                        left++; right--;
                    } else if (num[left] + num[right] < sum) left++;
                    else right--;
                }
            }
        }
        return res;
    }
}
```

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-16
Time | 	6548ms
Memory |  88.3MB	
