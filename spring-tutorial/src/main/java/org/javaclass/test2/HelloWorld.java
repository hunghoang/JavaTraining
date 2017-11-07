package org.javaclass.test2;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	public void sayHello(String name) {
		System.out.println("Hello:" + name);
	}
}
