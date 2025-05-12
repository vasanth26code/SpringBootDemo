package com.vasanth.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {

//		SpringApplication.run(SpringBootDemoApplication.class, args);
//		System.out.println("vasa");
//      Player obj = new Player();
//		obj.code();

		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

//		Player obj = context.getBean(Player.class);
//		obj.code();

		Player obj1 = context.getBean(Player.class);
		obj1.code();



	}

}
