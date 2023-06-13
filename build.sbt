ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.1"

lazy val root = (project in file("."))
  .settings(
    name := "Spark-RDD-Example"
  )

lazy val circeVersion = "0.14.5"

libraryDependencies ++= Seq(
  // Postgres DB
  "org.postgresql"          % "postgresql"              % "42.5.4",

  // In Mem H2 DB
  "com.h2database"          % "h2"                      % "2.1.214",

  // Spark
  "org.apache.spark"        %% "spark-core"             % "3.4.0",
  "org.apache.spark"        %% "spark-sql"              % "3.4.0",
  "org.apache.spark"        %% "spark-streaming"        % "3.4.0",
  "org.apache.spark"        %% "spark-mllib"            % "3.4.0",


  // JSON
  "io.circe"                %% "circe-core"             % circeVersion,
  "io.circe"                %% "circe-generic"          % circeVersion,
  "io.circe"                %% "circe-parser"           % circeVersion,

  // Testing
  "org.scalatest"           %% "scalatest"              % "3.2.15"        % Test,
  "org.scalatest"           %% "scalatest-funspec"      % "3.2.15"        % Test,
  "org.scalatestplus"       %% "scalacheck-1-17"        % "3.2.15.0"      % Test,
  "org.scalamock"           %% "scalamock"              % "5.2.0"         % Test
)