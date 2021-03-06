import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

name :="nbrno"

scalaVersion :="2.10.3"

version :="0.1"

parallelExecution in Test := false

resolvers += "coda" at "http://repo.codahale.com"

resolvers += "sonatype-repo" at "http://oss.sonatype.org"

resolvers += "sonatype-repo" at "http://oss.sonatype.org/content/repositories/snapshots"

resolvers += "maven-repo" at "http://search.maven.org"

resolvers += "jboss repo" at "http://repository.jboss.org/nexus/content/groups/public-jboss/"

classpathTypes += "orbit"

libraryDependencies ++= Seq(
  "org.eclipse.jetty.orbit" % "javax.servlet" % "2.5.0.v201103041518" artifacts (
    Artifact("javax.servlet", "jar", "jar")
  )
)

libraryDependencies += "postgresql" % "postgresql" % "9.1-901.jdbc4"

libraryDependencies += "net.databinder" %% "unfiltered-filter" % "0.6.8"

libraryDependencies += "net.databinder" %% "unfiltered-json" % "0.6.7"

libraryDependencies += "net.databinder" %% "unfiltered-jetty" % "0.6.8"

libraryDependencies += "com.typesafe.slick" %% "slick" % "1.0.1"

libraryDependencies <+= (scalaVersion)("org.scala-lang" % "scala-compiler" % _)

libraryDependencies += "com.lambdaworks" % "scrypt" % "1.4.0"

libraryDependencies += "org.json4s" %% "json4s-native" % "3.2.4"

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.5"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.13"

libraryDependencies += "org.scalatest" %% "scalatest" % "1.9.1" % "test"

libraryDependencies += "junit" % "junit" % "4.10" % "test"

libraryDependencies += "org.scalamock" %% "scalamock-scalatest-support" % "3.0.1" % "test"

libraryDependencies += "com.h2database" % "h2" % "1.3.173" % "test"

libraryDependencies += "io.gatling" % "gatling-core" % "2.0.0-SNAPSHOT" % "test"

libraryDependencies += "io.gatling" % "gatling-http" % "2.0.0-SNAPSHOT" % "test"

libraryDependencies += "io.gatling" % "gatling-app" % "2.0.0-SNAPSHOT" % "test"

libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % "2.0.0-SNAPSHOT" % "test"

libraryDependencies += "org.specs2" %% "specs2" % "2.3.4" % "test"

libraryDependencies += "net.databinder.dispatch" %% "dispatch-core" % "0.11.0" % "test"

libraryDependencies += "org.eclipse.jetty" % "jetty-servlets" % "7.6.9.v20130131"

