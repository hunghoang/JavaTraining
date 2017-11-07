package org.javaclass.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class App2 {
	
	
	private HelloWorld helloWorld;
	
	@Autowired
	public App2(HelloWorld helloWorld) {
		this.helloWorld = helloWorld;
	}
	
	public void saySomething2() {
        helloWorld.sayHello("Java class 2");
    }
}
