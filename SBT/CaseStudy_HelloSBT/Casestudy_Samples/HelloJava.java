package com.sbt.java;

public class HelloJava {

	String name;

	public HelloJava(String name){
		this.name = name;
	}

	public String sayHello() {
		return "Hello " + name;
	}

	public static void main(String[] args) {
		HelloJava obj = new HelloJava("Java");
		System.out.println(obj.sayHello());

	}

}
