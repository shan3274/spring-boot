package org.shan;

public class Laptop implements Computer {
    public Laptop(){
        System.out.println("Laptop called");
    }
    public void compile(){
        System.out.println("This is compile method in laptop");
    }
}
