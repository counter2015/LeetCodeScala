# Next Permutation

## Problem link
https://leetcode.com/problems/next-permutation/

## Description
Implement **next permutation**, which rearranges numbers into the lexicographically next greater permutation of numbers.

If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).

The replacement must be **in-place** and use only constant extra memory.

## Example
Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.

```
1,2,3` → `1,3,2`
`3,2,1` → `1,2,3`
`1,1,5` → `1,5,1
```




## Solution

It's easy to find when the `nums` is a non-incremental sequence, just reverse the `nums`. 

In other situation, we should right first (nums(i) < nums(i+1)), let take `[2,4,8,7,4,5,5,4,3]` as example.
when i = 4, nums(4) = 4 < 5 = nums(5), let `l` become the index, 4.

We get `l`, that's to say, by swap nums(l) with another number we can get the next permutation.

Let suppose the swap index to `r`, nums(r) should be just greater than nums(l),
from right to left , we get nums(6) = 5 as the first number satisfy.
                      .
After swap, `[2,4,8,7,5,5,4,4,3]`, well, amost done.

Last step, reverse the `tail` of `nums` right from index `r`, that's to say,
reverse `[5,4,4,3]` to `[3,4,4,5]`, so the tail index can be minimize.

Just implement it by coding.

 
  
    
## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-02
Time | 308 ms
Memory | 51.6 MB	