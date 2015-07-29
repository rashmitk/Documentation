package com.sbt.java;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HelloJavaTest {
	
	@Test public void testSayHelloTest() {
		HelloJava obj = new HelloJava("Java");
		assertEquals("Hello Java", obj.sayHello());
	}
}
