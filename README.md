# LeetCode Scala
[![Build Status](https://travis-ci.com/counter2015/LeetCodeScala.svg?branch=master)](https://travis-ci.com/counter2015/LeetCodeScala)
[![CodeFactor](https://www.codefactor.io/repository/github/counter2015/leetcodescala/badge)](https://www.codefactor.io/repository/github/counter2015/leetcodescala)
[![Github Action Status](https://img.shields.io/github/workflow/status/counter2015/LeetcodeScala/Scala%20CI?color=green&label=actions&logo=github&logoColor=orange
)](https://img.shields.io/github/workflow/status/counter2015/LeetcodeScala/Scala%20CI?color=green&label=actions&logo=github&logoColor=orange
)
[![codecov](https://codecov.io/gh/counter2015/LeetCodeScala/branch/master/graph/badge.svg)](https://codecov.io/gh/counter2015/LeetCodeScala)

[中文版](./README-CN.md)

Solve LeetCode problem by scala.

Strongly inspired by https://github.com/Leibnizhu/LeetcodeScala

- Detailed unit testing
- Detailed solutions
- Using multiple paradigms to solve problems, that's to say, imperative and functional either

Why Scala?
- Scala is concise
- Scala is a statically typed 
- Scala is functional and object-oriented language

## Test
Using sbt.
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

It's easy to write your own test also.

## Solution
See [Solution Index Page](https://github.com/counter2015/LeetCodeScala/blob/master/solutions/README.md).

WIP...


## Other

Q: Why scala solutions so slow ?
A: The unit test cost time is normal, but it seems the time of environment initialization is calculated incorrectly.