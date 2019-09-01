# Substring with Concatenation of All Words

## Problem link
https://leetcode.com/problems/substring-with-concatenation-of-all-words/

## Description
You are given a string, s, 

and a list of words, words, 

that are all of the same length. 

Find all starting indices of substring(s) in s 
that is a concatenation of each word in 
words exactly once and without any intervening characters.

## Example
**Example 1:**

```
Input:
  s = "barfoothefoobarman",
  words = ["foo","bar"]
Output: [0,9]
Explanation: Substrings starting at index 0 and 9 are "barfoor" and "foobar" respectively.
The output order does not matter, returning [9,0] is fine too.
```

**Example 2:**

```
Input:
  s = "wordgoodgoodgoodbestword",
  words = ["word","good","best","word"]
Output: []
```




## Solution
This is also a implement problem.
Let us example 1 for instance.

1. Simplify words, to wordCount like following
`["for", "bar"]` => `[("foo", 1), ("bar", 1)]`
2. find all distinct word's index if the word is substring of s
here get `["foo" -> [0, 12], "bar" -> [3, 9]]` as indexMap
3. let's iterate in indexMap, given "bar", we get [3, 9] and want to check
if we start here can satisfy.
4. let's get 3, and the remain string is s.substring(3 + len(bar)), that's to say "thefoobarman"
5. now we get a new string and new wordCount, we can do it iterative

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-09-01
Time | 	2264 ms
Memory | 58.2 MB	