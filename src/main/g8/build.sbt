// give the user a nice default project!
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.11.8"
    )),
    name := "scala-opennlp",

    libraryDependencies += "org.apache.opennlp" % "opennlp-tools" % "1.9.1"
  )
