name := "finagletest"

version := "1.0"

resolvers += "twitter-repo" at "http://maven.twttr.com"

libraryDependencies += "com.twitter" % "finagle-http" % "5.3.4"
