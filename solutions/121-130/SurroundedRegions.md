# Surrounded Regions

## Problem link
https://leetcode.com/problems/surrounded-regions/

## Description

Given a 2D board containing `'X'` and `'O'` (**the letter O**), capture all regions surrounded by `'X'`.

A region is captured by flipping all `'O'`s into `'X'`s in that surrounded region.

Surrounded regions shouldn’t be on the border, which means that any `'O'` on the border of the board 
are not flipped to `'X'`. Any `'O'` that is not on the border and it is not connected to an `'O'` on 
the border will be flipped to `'X'`. Two cells are connected if they are adjacent cells connected horizontally or vertically.


**Note:** A leaf is a node with no children.

## Example

```
X X X X
X O O X
X X O X
X O X X
```

After running your function, the board should be:

```
X X X X
X X X X
X X X X
X O X X
```

## Solution
Just implement it.

A in place problem is not a good scala problem.

## Run Time Info

\- | \-
------------ | -------------
Date | 2020-08-10
Time |  576 ms
Memory | 54.1 MB
