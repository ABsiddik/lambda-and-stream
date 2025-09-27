package com.itkhamar.funcInterface;

public class GreetingImpl implements Greeting {
    @Override
    public void greet() {
        System.out.println("Hello World!");
    }
}
