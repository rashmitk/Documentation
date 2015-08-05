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
    		

//use publishLocal for publish to Ivy repository and publishM2 for publishing to Maven repository
//publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))


//If the source code doesn't exists in src/main/java and if exists in othersource then you can use following configuration
unmanagedSourceDirectories in Compile <++= baseDirectory { base => Seq( base / "othersource") }