# Length of Longest Substring

## Problem Link 
https://leetcode.com/problems/longest-substring-without-repeating-characters/

## Description

Given a string, find the length of the **longest substring** without repeating characters.


## Example

**Example 1:**

```
Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
```


**Example 2:**

```
Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
```

**Example 3:**

```
Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
```

## Solution

- We can use a `Map` to save `(char,index)` information, so that we don't need to re-search from head.
- Suppose we use `index` for char in `str` position, use `current` to record max length now, use `result` to record total max length of `str`, use `curString` as the map to store `(char, index)` information.
- We can get the state change as following:
  1. Init state f(`index` = 0, `current` = 0, `result` = 0, `curString` = map.empty)
  2. At each position, the `ch` is `str(index)`, if
    - `ch` is in `curString`, we should renew the `result`, set map to empty state, set `index` to the last index of `ch` + 1, that's to say f(`curString(ch)` + 1, 0, max(`result`, `current`), map.empty)
    - `ch` is not in `curString`, this is easy, just add one to `index` and `current`, and add the new (char, index) to the map, that's to say f(`index` + 1, `current` + 1, `result`, `curString` + (ch -> index)),
  3. the final state is `index` == `str`.length-1, we shoule renew `result` as max(`result`, `current`)
  
## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-02
Time | 876 ms
Memory | 53.5 MB	