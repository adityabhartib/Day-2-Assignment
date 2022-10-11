package com.bridgelabz.WhilleLoopProblems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        int reminder, reverse = 0;

        while (num!=0) {
            reminder = num % 10;
            reverse=reverse*10+reminder;
            num=num/10;
        }
        System.out.println(reverse);
    }
}