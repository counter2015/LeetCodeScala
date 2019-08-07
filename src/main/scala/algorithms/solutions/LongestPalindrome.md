# Longest Palindromic Substring

## Problem link
https://leetcode.com/problems/longest-palindromic-substring/

## Description
Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.


## Example
**Example 1:**

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

**Example 2:**

Input: "cbbd"
Output: "bb"

## Solution


A normal solution is to travel the string, for each char, expand it to left and right, check the left and right char is the same or not.
For example, in the index `i`, if (str(i-1) == str(i+1)), so, str(i-1) to str(i+1) is a palindromic string, so we can check the next state
str(i-2) and str(i+2).

For each checkpoint, we should renew the mid char position and the max length of palindromic string.
This solution cost time O(n^2).



----

Another non-trivial O(n) algorithm is Manacher's algorithm.

Let's start from a example "babcbabcbaccba"
1. add '#' as split character (you will know the reason later)
2. suppose the origin string as S = "babcbabcbaccba", the new string T as "#b#a#b#c#b#a#b#c#b#a#c#c#b#a#"
3. our target it to calculate the array P, which store the max length of palindromic string for each position, once we can solve this, we can also get the longest palindromic string easy.

Now we find the main idea, the problem convert to how to efficient calculate the array P.
In the form solution, we found a way to solve problem in O(n^2), but we can optimize it in situation when palindrome strings overlap, such as "aaaaaa"
we can optimize it by the following two characteristics
- use extra space to store intermediate results
- using palindrome's characteristics to avoid repetitive computing

What's the palindrome's characteristics? Well, the left part is the reverse of right part, in other words, if `C` is the center of palindromic string, then str(c-i) = str(c+i)

Well, let's look for rules from examples.
for String T
```
     C
     v
 "#b#a#b#c#b#a#b#c#b#a#c#c#b#a#"
P 01030
       ^
```

When position = 5, P(5), C = 3, P(5) = P(2*C - 5) = P(1) = 1
**First rule**, when we calculate the right side , we can reuse the result of left side as i + i' = 2 * C,
Here i = 5, i' = 1, C = 3

```
             C
             v
 "#b#a#b#c#b#a#b#c#b#a#c#c#b#a#"
P 010301070109010
                 ^       
```
When position = 15, C = 11, here T(15) = T(2 * 11 - 15) = T(7), 
So if we use the **first rule**, P(15) = P(7) = 7
Sadly, you will know it's wrong once you check it, the answer should be 5, it stands for "abcba"

What caused the mistake? It seems that something like boundary conditions are not taken into account.

```
         C1  C0  C2
         v   v   v
  -------#-------v               this is first palindrome range
    +++++++++#+++++++++          this is now center palindrome range
            =====#=====          this is second palindrome range
 "#b#a#b#c#b#a#b#c#b#a#c#c#b#a#"
P 010301070109010
```
In this way, we can easy found that the first palindrome range exceed the left bound of now palindrome range.
In this case, character "b" is not in \[C-P(C), C+P(C)\], but "7" contains this information, which lead to mistake.
R = C + P(C), R stand for the right most index,
L = C - P(C), L stand for the left most index,
By using palindrome's characteristics to avoid repetitive computing,
we know that from now check position to right most index should be part of second palindrome string, So
P(i) >= R - i = C + P(C) - i = 11 + 9 - 15 = 5, i stand for now check position.
Now we add a new rule and modify first rule.

**Second Rule**, when we calculate the right side, suppose now position is "i", center is "C", the mirror position "i'" = 2 * C - i,
if i' - P(i') < C - P(C) => C + P(C) < i + P(i'), we don't use first rule, because the left palindrome range exceed now palindrome range.
But we know P(i) >= C + P(C) - i = 5, so from  str(i + 6), str(i - 6) to check.


To sum up the two rules.
```
if P[i'] < R - i
  P[i] <- P[i']
else 
  P[i] >= R - i
  check P[i] from R-i
```
Another problem is C, when should we renew it?
That is easy , see this example.
```
     C
     v
 "#b#a#b#c#b#a#b#c#b#a#c#c#b#a#"
P 0103010
         ^       
```
Here, position = 8, R = C + P(C) = 4 + 3 = 7 < position. P(8) can't calculate from former result , so we should change C to now position.
So as to L and R.
Once  R < i + P(i), renew R to i + P(i), renew C to i.

During the iteration, maintain len as max(p(i)), and its center.

The longest palindromic should be S((center - len)/2 ... (center + len)/2) 

## Reference 
[Wikipedia: Longest palindromic substring](https://en.wikipedia.org/wiki/Longest_palindromic_substring)

[HackerRank: Manacher's Algorithm](https://www.hackerrank.com/topics/manachers-algorithm)

## Run Time Info

\- | \-
------------ | -------------
Date | 2019-08-07
Time | 	 276ms
Memory |  49.8MB	
