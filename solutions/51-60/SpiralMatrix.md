#  Spiral Matrix

## Problem link
https://leetcode.com/problems/spiral-matrix/

## Description
Given a matrix of *m* x *n* elements (*m* rows, *n* columns),
 return all elements of the matrix in spiral order.
## Example
**Example 1:**

```
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]
```

**Example 2:**

```
Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
```

`



## Solution
This question is very like [RotateImage](https://leetcode.com/problems/rotate-image/), we can reuse the function.

Consider this problem can be convert to get the first line, then rotate the matrix counterclockwise.
For Example.
```
1 2 3              4 5 6              6 9
4 5 6  => [1,2,3]  7 8 9   => [1,2,3] 5 8  =>  [1,2,3,6,9] 5 8  => [1,2,3,6,9] 8 7 =>
7 8 9                                 4 7                  4 7                 5 4

[1,2,3,6,9,8,7] 5 4 => [1,2,3,6,9,8,7] 4 => [1,2,3,6,9,8,7,4] 5 => [1,2,3,6,9,8,7,4,5]
                                       5
```

How can we rotate the matrix counterclockwise? Well, a trivial solution is rotate it clockwise three times,

Another way is to first transpose it and then reverse it.
```
4 5 6   =>  4 7  =>  6 9
7 8 9       5 8      5 8
            6 9      4 7
```

Then just implement it




## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-25
Time | 244 ms
Memory | 44 MB	


