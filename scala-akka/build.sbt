import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-akka",
    libraryDependencies := Seq(
      scalaTest % Test,
      "com.typesafe.akka" %% "akka-actor" % "2.6.10",
      "com.typesafe.akka" %% "akka-actor-typed" % "2.6.10",
      "com.typesafe.akka" %% "akka-http" % "10.2.1",
      "com.typesafe.akka" %% "akka-stream" % "2.6.10"
    )
  )
