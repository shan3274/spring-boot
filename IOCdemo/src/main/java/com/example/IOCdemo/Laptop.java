package com.example.IOCdemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public void compile(){
        System.out.println("This is compile method");
    }
}
