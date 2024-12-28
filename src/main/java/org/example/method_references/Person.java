package org.example.method_references;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

