package com.bridgelabz;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int digit;
        int sum = 0;
        while (num > 0) {
            //123=1+2+3=123%10=
            digit = num % 10;
            //System.out.println(digit);
            sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of digits is : " + sum);
    }
}
