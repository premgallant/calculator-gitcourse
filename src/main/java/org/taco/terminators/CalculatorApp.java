package org.taco.terminators;

public class CalculatorApp {

    public static void main(String[] args) {
        Multiplication multiplication = new Multiplication();
        Subtraction subtraction = new Subtraction();
        Sum addition = new Sum();

        System.out.println("Addition\t"+addition.sum(10,10));
        System.out.println("Subtraction\t"+subtraction.subtract(10,10));
        System.out.println("Multiplication\t"+multiplication.multiply(10,10));

    }
}
