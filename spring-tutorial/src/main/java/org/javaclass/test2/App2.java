package org.javaclass.test2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class App2 {
	
	
	private Say say;
	
	@Autowired
	public App2(@Qualifier("goodbye") Say say) {
		this.say = say;
	}
	
	public void saySomething2() {
        say.say("Java App 2");
    }
}
