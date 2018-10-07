

lazy val projectName = "graph_algorithms"
lazy val versionNumber = "0.1"
lazy val scalaVersionNumber = "2.12.7"
val scalaTestVersion     = "3.0.5"

lazy val dependencies = Seq(
  "org.scalactic"                %% "scalactic"              % scalaTestVersion % "test",
  "org.scalatest"                %% "scalatest"              % scalaTestVersion % "test"
)

lazy val graph_algorithms = project
  .in(file("."))
  .settings(
    name := projectName,
    version := versionNumber,
    scalaVersion := scalaVersionNumber,
    scalacOptions ++= Seq("-feature", "-deprecation", "-unchecked"),
    javaOptions ++= Seq("-Xmx16g"),
    libraryDependencies ++= dependencies
  )