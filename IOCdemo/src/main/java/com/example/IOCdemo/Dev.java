package com.example.IOCdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired //field injuction
    @Qualifier("laptop")
    private  Computer computer;

//      constructor injuction
//    public  Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

//    setter injuction
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }
    public void build(){
        computer.compile();
        System.out.println("This is demo of IOC");
    }
}
