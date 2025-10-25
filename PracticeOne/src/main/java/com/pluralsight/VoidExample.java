package com.pluralsight;

public class VoidExample {

    public static void main(String[] args) {
        greetUser("Richie");
        int result = add(9, 10);
        System.out.println(result);
    }

    public static void greetUser(String name) {
        System.out.println("Hello " + name + "! Welcome back!");
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }
}
