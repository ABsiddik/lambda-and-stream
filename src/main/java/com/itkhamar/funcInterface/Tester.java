package com.itkhamar.funcInterface;

public class Tester {
    public static void main(String[] args) {

        // Traditional interface call by implementation
        Greeting greeting1 = new GreetingImpl();
        greeting1.greet();

        // This is an anonymous inner class that implements
        Greeting greeting2 = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello World!");
            }
        };
        greeting2.greet();

        // This is lambda expression with Functional Interface
        Greeting greeting3 = () -> System.out.println("Hello World!");
        greeting3.greet();
    }
}
