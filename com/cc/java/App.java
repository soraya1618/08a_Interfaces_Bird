package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Bird bird = new Bird();
       output(bird.fly());
      
     
    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }



}

