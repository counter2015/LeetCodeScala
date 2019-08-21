# Generate Parentheses

## Problem link
https://leetcode.com/problems/generate-parentheses/

## Description
Given *n* pairs of parentheses,
write a function to generate all combinations of well-formed parentheses.
## Example

For example, given *n* = 3, a solution set is:

```
[
  "((()))",
  "(()())",
  "(())()",
  "()(())",
  "()()()"
]
```


## Solution
By using recursive way, this problem is easy to solve.

While running, the algorithm keeps track of the number of remaining left parentheses `l`, 
the number of remaining right parenthesis `r`, 
the result so far `curString`,
and the total result list `res` . 

Recursive function start at fun(l = n, r = n, curString = "", res = empty list)

if l == r == 0, save current result to `res` ;

if l > 0, add left parenthesis to `curString`, fun(l-1, r, curString + "(", res)

if r > l, we can add a right parenthesis correctly. fun(l, r-1, curString + ")", res)
 
This problem is relative to [Catalan Number](https://en.wikipedia.org/wiki/Catalan_number)

 


## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-21
Time | 	280 ms
Memory | 50.9 MB	