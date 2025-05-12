package com.vasanth.SpringBootDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {

//    public void code()
//    {
//        System.out.println("hellooooo");
//    }

    @Autowired
    Laptop laptop;

    public void code()
    {
        laptop.compile();
    }

}
