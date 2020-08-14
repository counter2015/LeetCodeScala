# LeetCode Scala
[![Build Status](https://travis-ci.com/counter2015/LeetCodeScala.svg?branch=master)](https://travis-ci.com/counter2015/LeetCodeScala)
[![CodeFactor](https://www.codefactor.io/repository/github/counter2015/leetcodescala/badge)](https://www.codefactor.io/repository/github/counter2015/leetcodescala)
[![Github Action Status](https://img.shields.io/github/workflow/status/counter2015/LeetcodeScala/Scala%20CI?color=green&label=actions&logo=github&logoColor=orange
)](https://img.shields.io/github/workflow/status/counter2015/LeetcodeScala/Scala%20CI?color=green&label=actions&logo=github&logoColor=orange
)
[![codecov](https://codecov.io/gh/counter2015/LeetCodeScala/branch/master/graph/badge.svg)](https://codecov.io/gh/counter2015/LeetCodeScala)

[English Version](./README.md)

Scala Leetcode 刷题记录.

受到此项目的启发 https://github.com/Leibnizhu/LeetcodeScala

-详细的单元测试

-较完整的题解和思路

-使用多种范例求解，命令式/函数式 Scala 风格。

为什么是 Scala ?
- 简洁所以容易阅读(经过训练的眼睛)
- 静态类型所以错误在编译时就暴露
- 多范式所以可以自由发挥

## Test
使用SBT进行测试，下面是对某题进行测试的例子.
```sbtshell
> testOnly algorithms.medium.string.LongestPalindromeTest

[info] - test0: sample input
[info] - test1: sample input
[info] - test2: sample input
[info] - test3: cbbd
[info] - test4: null string
[info] - test5: one element
[info] - test6: distinct element
[info] Run completed in 660 milliseconds.
[info] Total number of tests run: 7
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 7, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 9 s, completed 2019-8-7 18:55:49

```

如果你需要的话，也可以轻松的使用自己的数据测试。

## 题解
参见[题解索引页](https://github.com/counter2015/LeetCodeScala/blob/master/solutions/README.md) 题解只提供英文版 <del>怠惰的我</del>

施工中...

## 其他

问: 为什么Scala写的代码这么慢 ?
答: 本地单元测试的时间是正常的，看起来是由于LeetCode错误地把环境初始化的时间算到了运行时间内。