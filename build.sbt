lazy val root = (project in file("."))
  .settings(
    name                := "Gridmaster4",
    scalaVersion        := "2.12.3",
    version             := "0.0.1",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"
  )
