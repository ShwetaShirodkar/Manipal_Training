package com.sss.springboot.SpringBoot.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Setter
@Getter
public class Car {
    private Long id;
    private String make;
    private String model;
}
