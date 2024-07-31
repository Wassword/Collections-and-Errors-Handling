package org.example.PracticeHandlingException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("Mike.j", 30);
            System.out.println(person);
        } catch (IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }

        try {
            Person person = new Person("", 150);//invalid

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        Calculator calculator = new Calculator();

        try {
            System.out.println("Binomial Coefficient (5, 3): " + calculator.binomialCoefficient(5, 3)); // Valid
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Binomial Coefficient (5, 6): " + calculator.binomialCoefficient(5, 6)); // Invalid
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
