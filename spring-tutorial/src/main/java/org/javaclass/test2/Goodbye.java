package org.javaclass.test2;

import org.springframework.stereotype.Component;

@Component
public class Goodbye implements Say {

	public void say(String name) {
		System.out.println("Version of Goodbye say goodbye:" + name);
	}

}
