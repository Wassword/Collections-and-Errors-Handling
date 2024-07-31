package org.example.PracticeHandlingException;

public class Person {
    private String name;
    private int age;

    // Constructor with validation
    public Person(String name, int age) {
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Invalid name: Name cannot be null, empty, or longer than 40 characters.");
        }
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age: Age must be between 0 and 120.");
        }

        this.name = name;
        this.age = age;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
