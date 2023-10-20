package org.example;

public class Vacancy {
private String name;

    public Vacancy(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name;
    }
}
