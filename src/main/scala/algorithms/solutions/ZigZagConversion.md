# ZigZag Conversion

## Problem link
https://leetcode.com/problems/zigzag-conversion/

## Description 

The string `"PAYPALISHIRING"` is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

```
P   A   H   N
A P L S I I G
Y   I   R
```

And then read line by line: `"PAHNAPLSIIGYIR"`

Write the code that will take a string and make this conversion given a number of rows:

```
string convert(string s, int numRows);
```

## Example

**Example 1:**

```
Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
```

**Example 2:**

```
Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I
```

## Solution
It's easy to observe that the string has a cycle `T`, T = 2 * numRows - 2


Suppose i as the index of string , at each T
- if i % T <= T / 2, row = i % T 
- if i % T > T / 2, row = T - i % T

During the string iteration, append char str(i) at res(row), here res is a `Array[String]`,
For **Example 2 ** 
res = Array( "PIN", "ALSIG", "YAHR", "PI"), then the answer is easy to get by using `mkString` to contact the element of `Array[String]` 

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-08
Time | 	388 ms
Memory | 52.7 MB	

