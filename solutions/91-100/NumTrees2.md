# Unique Binary Search Trees II

## Problem link
https://leetcode.com/problems/unique-binary-search-trees-ii/ 

## Description

Given an integer *n*, generate all structurally unique **BST's** (binary search trees) that store values 1 ... *n*.

## Example

```
Input: 3
Output:
[
  [1,null,3,2],
  [3,2,null,1],
  [3,1,null,null,2],
  [2,1,3],
  [1,null,2,null,3]
]
Explanation:
The above output corresponds to the 5 unique BST's shown below:

   1         3     3      2      1
    \       /     /      / \      \
     3     2     1      1   3      2
    /     /       \                 \
   2     1         2                 3
```



## Solution
Suppose the input number is `n`, then the root can be select from 1 to n.

If we have choose a number `a` as root, and suppose we can implement the function 
`def gen(root: Int, leftNodes: List[Int], rightNodes: List[Int]): List[TreeNode]` 
which can generate all valid binary search trees. 

Then we just need to contact result. The `gen` function can be invoked recursively.

the steps are like following:

1. choose a root from 1 to n.
2. split the number to three part
  - root
  - leftNodes: nums less than root
  - rightNodes: nums greater than root
3. invoke function `gen(root, leftNodes, rightNodes)` which can generate all BST.
4. contact the result from root 1 to root n.  


Let's deep into `gen` function implement.
In each half part of nodes(`leftNodes` or `rightNodes`), we can choose a root and invoke `gen` function to
generate their subtrees. Just like the step1 and step2.

Consider the boundary condition of the function, if nodes contain no element, it should return `List()`
if nodes contains only one element, it should return `List(new TreeNode(element))`

We are about to solve this problem. The last part is merge result form
- `leftTrees: List[TreeNode]`
- `rightTrees: List[TreeNode]`
- `root: Int`

If either `leftTrees` or `rightTrees` is empty, then the root should be insert to their top,
for example, 
```
leftTrees.map(lt => {
  val node = new TreeNode(root)
  node.left = lt
  node})
````

If `leftTrees` and `rightTrees` are both empty, then the result is just one node.

If `leftTrees` and `rightTrees` are both not empty, then just compose  left and right trees between root node.

That's all.

## Run Time Info

\- | \-
------------ | -------------
Date | 2020-03-05
Time | 592 ms
Memory | 52.7 MB	
