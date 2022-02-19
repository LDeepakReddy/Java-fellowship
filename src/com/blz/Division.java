package com.blz;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner C = new Scanner(System.in);
        double a = C.nextFloat();
        double b = C.nextFloat();
        double division = a / b;
        System.out.println("Division of two numbers" + division);
    }
}
