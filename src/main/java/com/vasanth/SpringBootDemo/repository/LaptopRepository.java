package com.vasanth.SpringBootDemo.repository;

import com.vasanth.SpringBootDemo.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void saveLaptop(Laptop lap)
    {
        System.out.println("Data saved in DB....");
    }

}
