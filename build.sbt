name := "semantics-impls"

version := "0.2"

scalaVersion := "2.13.1"

// https://mvnrepository.com/artifact/org.antlr/antlr4-runtime
libraryDependencies += "org.antlr" % "antlr4-runtime" % "4.7.2"


mainClass in (Compile, run) := Some("com.freddieposer.semantics.supo1.Test")