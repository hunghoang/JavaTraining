package org.javaclass.test2;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld implements Say {
	public void say(String name) {
		System.out.println("new version of helloworld say hello:" + name);
	}
}
