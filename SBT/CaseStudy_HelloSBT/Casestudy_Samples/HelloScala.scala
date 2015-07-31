package com.sbt.scala

class HelloScala(val name: String){
  
  def sayHello = "Hello " + name
  
}

object HelloScala {

  def main(args: Array[String]): Unit = {
    val obj = new HelloScala("Scala")
    println(obj.sayHello)
  } 
}