package com.cc.java;

public class Bird implements Flyable,IFeathers{

    @Override
    public String fly() {
        return "I can fly at 20mph!";
    }

    @Override
    public String hasFeathers() {
     
        return "I clean my feathers myself!";
        
    }


}
