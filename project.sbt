organization in Global := "io.verizon.knobs"

crossScalaVersions in Global := Seq("2.12.1")

scalaVersion in Global := crossScalaVersions.value.head

bintrayOmitLicense in ThisBuild := true

licenses in ThisBuild += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0"))

lazy val knobs = project.in(file(".")).aggregate(core, typesafe, zookeeper)

lazy val core = project

lazy val typesafe = project.dependsOn(core)

lazy val zookeeper = project.dependsOn(core)
