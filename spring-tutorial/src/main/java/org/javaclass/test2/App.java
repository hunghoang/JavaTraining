package org.javaclass.test2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */

@Component
public class App {
	
	private HelloWorld helloWorld;
	
	@Autowired
	public App(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
		
	}

	@PostConstruct
	public void loadDataFromDatabase() {
		System.out.println("Load from database");
	}
	
	public void saySomething1() {
		helloWorld.sayHello("Java class 1");
	}

	public void sayAnything() {
		helloWorld.sayHello("Java class 1");
	}
}
