name := "chapter3-bookstore-common-incomplete"

 
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.4",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.4",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.4",
  "ch.qos.logback" % "logback-classic" % "1.0.9",
  "com.typesafe.slick" %% "slick" % "3.1.1",
  "com.typesafe.slick" %% "slick-hikaricp" % "3.1.1",
  "net.databinder" %% "unfiltered-filter" % "0.8.4",
  "net.databinder" %% "unfiltered-netty" % "0.8.4",
  "net.databinder" %% "unfiltered-netty-server" % "0.8.4",
  "net.databinder" %% "unfiltered-json4s" % "0.8.4",
  "org.json4s" %% "json4s-ext" % "3.2.9",
  "postgresql" % "postgresql" % "9.1-901.jdbc4",
  "net.databinder.dispatch" %% "dispatch-core" % "0.11.2"
)