import Dependencies._

ThisBuild / scalaVersion := "2.13.4"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-sttp",
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-effect" % "2.3.1",
      "dev.profunktor" %% "console4cats" % "0.8.1",
      "dev.zio" %% "zio" % "1.0.4",
      "io.monix" %% "monix" % "3.2.2",
      scalaTest % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
