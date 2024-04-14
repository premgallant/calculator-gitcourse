package org.taco.terminators;

public class Main {

    public int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        Main main = new Main();
        int result = main.sum(10, 10);
        System.out.println(result);
    }
}