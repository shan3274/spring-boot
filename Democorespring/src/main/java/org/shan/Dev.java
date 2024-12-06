package org.shan;

public class Dev {
//    private  int age;
//
//    public Dev(int age) {
//        this.age = age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
    private Computer computer;

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public  void build(){
        computer.compile();
        System.out.println("This is build method");
    }
}
