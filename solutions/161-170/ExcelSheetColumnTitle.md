# Excel Sheet Column Title

## Problem link
https://leetcode.com/problems/excel-sheet-column-title/description/

## Description
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

```
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
```



## Example

Example 1:
```
Input: columnNumber = 1
Output: "A"

```

Example 2:
```
Input: columnNumber = 28
Output: "AB"
```
Example 3:
```
Input: columnNumber = 701
Output: "ZY"
```

## Constraints:

- 1 <= columnNumber <= 2^31 - 1


## Solution

Just implement it. Be careful when columnNumber can be divided by 26, since there is no letter stands for zero, we should back to "Z"

## Run Time Info

| \-     | \-         |
|--------|------------|
| Date   | 2024-03-12 |
| Time   | 495 ms     |
| Memory | 53.3 MB    |

