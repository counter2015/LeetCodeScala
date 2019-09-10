# Count and Say

## Problem link
https://leetcode.com/problems/count-and-say/

## Description
The count-and-say sequence is the sequence of integers with the first five terms 
as following:

```
1.     1
2.     11
3.     21
4.     1211
5.     111221
```

`1` is read off as `"one 1"` or `11`.
`11` is read off as `"two 1s"` or `21`.
`21` is read off as `"one 2`, then `one 1"` or `1211`.

Given an integer *n* where 1 ≤ *n* ≤ 30, generate the *n*th term of the count-and-say sequence.

Note: Each term of the sequence of integers will be represented as a string.

## Example
**Example 1:**

```
Input: 1
Output: "1"
```

**Example 2:**

```
Input: 4
Output: "1211"
```



## Solution

This problem can be solved easily by recursive way.

given f(1) = "1"
f(2) = spell(f(1))

for n
f(n) = spell(f(n-1))

Then the problem convert to implement function `spell`
Let's see this example, for string "1211" how we spell it?

- First we group consecutive elements of the string, it should be 
`[1], [2], [1,1]`

- Then we add the length of each part to the head of each part, like list(x) => list(x.length, x.head) 
`[1,1], [1,2] [2,1]`

- Finally, flatten and make a string
`111221`

In scala, we can implementing  function `split` gracefully by pattern matching.

```scala  
def split[T](list: List[T]) : List[List[T]] = 
  list match {
    case Nil => Nil
    case h :: _ =>
      val segment = list.takeWhile{h == _}
      segment :: split(list.drop(segment.length))
    }
 ```
 
 See [Stackoverflow](https://stackoverflow.com/questions/4761386/scala-list-function-for-grouping-consecutive-identical-elements)
    
## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-10
Time | 268 ms
Memory | 48.6 MB	