name := "scalaPlay2"
 
version := "1.0" 
      
lazy val `scalaplay2` = (project in file(".")).enablePlugins(PlayScala)

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"
      
resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"
      
scalaVersion := "2.12.2"


libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test , guice )

//libraryDependencies += "org.avaje" % "ebean" % "2.8.1"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

      