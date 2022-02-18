package com.blz;

import java.util.Scanner;

public class substraction {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner C = new Scanner(System.in);
        int a = C.nextInt();
        int b = C.nextInt();
        int Substraction = a - b;
        System.out.println("Substraction of two numbers " + Substraction);
    }

}
