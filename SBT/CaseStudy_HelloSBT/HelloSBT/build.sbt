//Organization
organization := "com.cybage.hellosbt"

//Version of your project
version := "1.0.0"

//Scala version
scalaVersion := "2.11.6"

//Name of Project
name := "HelloSBT"


libraryDependencies ++= 
		Seq("junit" % "junit" % "4.10",
			"org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
    		)
    		
publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))


