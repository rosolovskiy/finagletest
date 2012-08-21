name := "finagletest"

version := "1.0"

resolvers += "twitter-repo" at "http://maven.twttr.com"

resolvers += "scala-tools" at "https://oss.sonatype.org/content/groups/scala-tools/"

libraryDependencies += "com.twitter" % "finagle-http" % "5.3.1"
