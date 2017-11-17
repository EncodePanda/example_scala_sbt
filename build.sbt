name := "example_scala_sbt"

scalaVersion := "2.12.4"

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies ++= Seq(
  "org.scalaz" %% "scalaz-core" % "7.2.16",
  "org.scalatest" %% "scalatest" % "3.0.3" % "test"
)
