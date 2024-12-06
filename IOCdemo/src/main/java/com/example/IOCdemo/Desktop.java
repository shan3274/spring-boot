package com.example.IOCdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("This is complie method in Desktop");
    }
}
