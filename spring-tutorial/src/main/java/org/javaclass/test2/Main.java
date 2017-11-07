package org.javaclass.test2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main1(String[] args) {
		HelloWorld helloWorld = new HelloWorld(); //#1
		App app1 = new App(helloWorld);//#2
		App2 app2 = new App2(helloWorld);//#3
		
		app1.saySomething1();
		app1.sayAnything();
		app2.saySomething2();
	}
	
	public static void main2(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		context.getBean(App.class).saySomething1();
		context.getBean(App.class).sayAnything();
		context.getBean(App2.class).saySomething2();
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
		context.getBean(App.class).saySomething1();
		context.getBean(App.class).sayAnything();
		context.getBean(App2.class).saySomething2();
	}
	
	public static void main4(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.refresh();
		context.scan("org.javaclass.test2");
		
		
		
		
		context.getBean(App.class).saySomething1();
		context.getBean(App2.class).saySomething2();
		((App) context.getBean("app")).saySomething1();
	}
}
