name := "LeetCodeScala"

organization := "com.counter2015"

version := "1.0"

scalaVersion := "2.13.1"


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.1.0" % Test
)

scalacOptions ++= Seq(
  "-deprecation", // Emit warning and location for usages of deprecated APIs.
  "-encoding", "utf-8", // Specify character encoding used by source files.
  "-explaintypes", // Explain type errors in more detail.
  "-feature", // Emit warning and location for usages of features that should be imported explicitly.
)


/*
  docs here: http://www.scalatest.org/user_guide/using_scalatest_with_sbt
 -o[configs...]  - causes test results to be written back to sbt, which usually displays it on the standard output
   -D - show all durations
   -F - show full stack traces
 */
testOptions in Test += Tests.Argument("-oDF")
