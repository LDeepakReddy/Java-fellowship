package com.blz;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        System.out.println("Enter the numbers");
        Scanner C = new Scanner(System.in);
        int a = C.nextInt();
        int b = C.nextInt();
        int Sum = a + b;
        System.out.println("sum of two numbers " + Sum);
    }
}
