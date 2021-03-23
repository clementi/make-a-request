import Dependencies._

ThisBuild / scalaVersion := "2.13.4"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-sttp",
    libraryDependencies ++= Seq(
      "com.pepegar" %% "hammock-core" % "0.11.3",
      "com.pepegar" %% "hammock-circe" % "0.11.3",
      "com.pepegar" %% "hammock-apache-http" % "0.11.3",
      scalaTest % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
