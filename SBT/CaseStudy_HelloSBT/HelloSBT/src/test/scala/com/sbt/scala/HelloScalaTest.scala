package com.sbt.scala;

import org.scalatest.FunSuite

class TestHelloSBTScala extends FunSuite {
  test("Hello Scala Check"){
    val o = new HelloScala("Scala")
    assert(o.sayHello == "Hello Scala")
  }
}