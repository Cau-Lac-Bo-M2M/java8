package org.example.default_methods;

public class Dog implements Animal {

    @Override
    public void makeSound() {
        System.out.println("the dog is barking...");
    }
}
