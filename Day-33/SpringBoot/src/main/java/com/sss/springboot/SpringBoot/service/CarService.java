package com.sss.springboot.SpringBoot.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.sss.springboot.SpringBoot.entity.Car;

@Service
public class CarService {
    
    @Value("${ws}")
    private String website;

    public void createNewCar(Long id, String make, String model) {

        Car car = new Car();
        car.setId(id);
        car.setMake(make);
        car.setModel(model);
        System.out.println("Car Company Website: " + website);
        System.out.println(car.toString());
    }
}