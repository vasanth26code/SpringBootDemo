package com.vasanth.SpringBootDemo;

import com.vasanth.SpringBootDemo.model.Laptop;
import com.vasanth.SpringBootDemo.service.LaptopService;
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

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);

		service.addLaptop(lap);

//		Player obj1 = context.getBean(Player.class);
//		System.out.println(obj1.getAge());
//		obj1.code();



	}

}
