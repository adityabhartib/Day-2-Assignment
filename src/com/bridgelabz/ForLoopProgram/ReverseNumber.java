package com.bridgelabz.ForLoopProgram;

import java.util.Scanner;

public class ReverseNumber {
    static void checkReverse(int num){
        int reminder,reverse=0;
for (;num!=0;num=num/10){
    reminder=num%10;
    reverse=reverse*10+reminder;
}
        System.out.println(reverse);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        checkReverse(num);
    }
}
