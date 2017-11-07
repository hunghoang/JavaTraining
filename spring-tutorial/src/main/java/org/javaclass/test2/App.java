package org.javaclass.test2;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Hello world!
 *
 */

@Component
public class App {
	
	@Value("${number}")
	private int number;
	
	@Value("${test}")
	private String test;
	
	private Say say;
	
	@Autowired
	public App(@Qualifier("helloWorld") Say say) {
		this.say = say;
	}

	@PostConstruct
	public void loadDataFromDatabase() {
		System.out.println("Load from database");
	}
	
	public void saySomething1() {
		say.say("Java class 1");
		System.out.println(number);
		System.out.println(test);
	}

	public void sayAnything() {
		say.say("Java class 1");
	}
}
