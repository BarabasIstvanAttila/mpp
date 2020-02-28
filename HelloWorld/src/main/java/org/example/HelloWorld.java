package org.example;

public class HelloWorld {

    public static void main(String args[]) {

        System.out.println("Hello World");
        Concatenate concat = new Concatenate();
        System.out.println("Concatenate "+concat.concatenate("Hello", "World"));
    }

}
