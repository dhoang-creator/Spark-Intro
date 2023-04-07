name := "sparkai"
organization := "com.dhoang-creator"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.6"
lazy val circeVersion = "0.14.5"

ThisBuild / libraryDependencySchemes ++= Seq(
  "org.scala-lang.modules" %% "scala-xml" % VersionScheme.Always
)

libraryDependencies += guice

libraryDependencies ++= Seq(
  // Postgres DB
  "org.postgresql"    % "postgresql" % "42.5.4",

  // Slick Connection Pool -> is this needed when working
  "com.typesafe.slick" %% "slick-hikaricp" % "3.4.1",

  // logging and in mem H2 DB
  "org.slf4j" % "sl4jp-nop" % "2.0.5",
  "com.h2database" % "h2" % "2.1.214",

  // Caching
  caffeine,
  ehcache,
  cacheApi,

  // JSON
  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-generic" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,

  // Testing
  "org.scalatest" %% "scalatest" % "3.2.15",
  "org.scalatest" %% "scalatest-funspec" % "3.2.15",
  "org.scalatestplus" %% "scalacheck-1-17" % "3.2.15.0",
  "org.scalamock" %% "scalamock" % "5.2.0",
  "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0"
)