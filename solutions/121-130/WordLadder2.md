# Word Ladder II

## Problem link
https://leetcode.com/problems/word-ladder-ii/

## Description

Given two words (*beginWord* and *endWord*), and a dictionary's word list, find all shortest transformation sequence(s) from *beginWord* to *endWord*, such that:

1. Only one letter can be changed at a time
2. Each transformed word must exist in the word list. Note that *beginWord* is *not* a transformed word.

**Note:**

- Return an empty list if there is no such transformation sequence.
- All words have the same length.
- All words contain only lowercase alphabetic characters.
- You may assume no duplicates in the word list.
- You may assume *beginWord* and *endWord* are non-empty and are not the same.

## Example
**Example 1:**

```
Input:
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]

Output:
[
  ["hit","hot","dot","dog","cog"],
  ["hit","hot","lot","log","cog"]
]
```

**Example 2:**

```
Input:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log"]

Output: []

Explanation: The endWord "cog" is not in wordList, therefore no possible transformation.
```

 

## Solution
The problem is little complex, let's explain by example.

First, it's trivial that if the `endWord` is not in wordList, then there is no possible transformation.

Use the first input as example
```
beginWord = "hit",
endWord = "cog",
wordList = ["hot","dot","dog","lot","log","cog"]

hit -> hot -> dot -> dog -> cog
         |      |   
         |        -> lot -> log -> cog
         |
           -> lot -> log -> cog
                |
                  -> dot -> dog -> cog
```
Since we just need the shortest transformation sequence, so the answer is
```
[
  ["hit","hot","dot","dog","cog"],
  ["hit","hot","lot","log","cog"]
]
```
How can we get that? Well, we need [BFS algorithm](https://en.wikipedia.org/wiki/Breadth-first_search)

```
1  procedure BFS(G, root) is
2      let Q be a queue
3      label root as discovered
4      Q.enqueue(root)
5      while Q is not empty do
6          v := Q.dequeue()
7          if v is the goal then
8              return v
9          for all edges from v to w in G.adjacentEdges(v) do
10             if w is not labeled as discovered then
11                 label w as discovered
12                 w.parent := v
13                 Q.enqueue(w)
```

Here we have several questions:
- How to find the adjacent edges of a word?
- How to update and store the inner result of path?
- How to check set the terminate condition in which case we have find the shortest transformation sequence?

First DFS find the shortest transformation sequence length, then BFS find all the shortest paths.

Solve it one by one and implement it.


## Run Time Info

\- | \-
------------ | -------------
Date | 2020-08-03
Time |  1160 ms
Memory | 61.5 MB
