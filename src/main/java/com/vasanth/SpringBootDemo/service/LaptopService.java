package com.vasanth.SpringBootDemo.service;

import com.vasanth.SpringBootDemo.model.Laptop;
import com.vasanth.SpringBootDemo.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    private LaptopRepository laptopRepository;

    public LaptopRepository getLaptopRepository()
    {
        return laptopRepository;
    }

    @Autowired
    public void setLaptopRepository(LaptopRepository laptopRepository)
    {
        System.out.println("setter called");
        this.laptopRepository = laptopRepository;
    }


    public void addLaptop(Laptop lap)
    {
        laptopRepository.saveLaptop(lap);
    }

}
