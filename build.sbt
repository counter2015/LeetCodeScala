name := "LeetCodeScala"

organization := "com.counter2015"

version := "1.0"

scalaVersion := "2.13.0"


libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.8" % Test
)

scalacOptions ++= Seq(
  "-deprecation", // Emit warning and location for usages of deprecated APIs.
  "-encoding", "utf-8", // Specify character encoding used by source files.
  "-explaintypes", // Explain type errors in more detail.
  "-feature", // Emit warning and location for usages of features that should be imported explicitly.
)
