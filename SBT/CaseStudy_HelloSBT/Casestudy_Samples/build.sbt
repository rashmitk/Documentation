//Name of Project
name := "HelloSBT"

//Organization
organization := "com.cybage.hellosbt"

//Version of your project
version := "1.0.0"

//Scala version
scalaVersion := "2.11.6"


libraryDependencies ++= 
		Seq("junit" % "junit" % "4.10",
			"org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"
    		)


