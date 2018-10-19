inThisBuild(Def.settings(
  version := "1.0.0-RC1",
  organization := "org.scala-js",

  crossScalaVersions := Seq("2.12.6", "2.10.7", "2.11.12", "2.13.0-M4", "2.13.0-M5"),
  scalaVersion := crossScalaVersions.value.head,
  scalacOptions ++= Seq("-deprecation", "-feature", "-Xfatal-warnings"),

  homepage := Some(url("https://www.scala-js.org/")),
  licenses += ("BSD New",
      url("https://github.com/scala-js/scala-js-stubs/blob/master/LICENSE")),
  scmInfo := Some(ScmInfo(
      url("https://github.com/scala-js/scala-js-stubs"),
      "scm:git:git@github.com:scala-js/scala-js-stubs.git",
      Some("scm:git:git@github.com:scala-js/scala-js-stubs.git"))),
))

lazy val `scalajs-stubs`: Project = project.in(file("."))
  .settings(
    publishMavenStyle := true,
    publishTo := {
      val nexus = "https://oss.sonatype.org/"
      if (isSnapshot.value)
        Some("snapshots" at nexus + "content/repositories/snapshots")
      else
        Some("releases" at nexus + "service/local/staging/deploy/maven2")
    },
    pomExtra := (
      <developers>
        <developer>
          <id>sjrd</id>
          <name>Sébastien Doeraene</name>
          <url>https://github.com/sjrd/</url>
        </developer>
        <developer>
          <id>gzm0</id>
          <name>Tobias Schlatter</name>
          <url>https://github.com/gzm0/</url>
        </developer>
      </developers>
    ),
    pomIncludeRepository := { _ => false },
  )
