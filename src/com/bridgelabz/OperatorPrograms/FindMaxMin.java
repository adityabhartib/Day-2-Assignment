package com.bridgelabz.OperatorPrograms;

import java.util.Scanner;

public class FindMaxMin {
    static void checkmaxmin(int a,int b,int c){
        int d=a+b*c;
        int d1=c+a/b;
        int d3=a%b+c;
        int d4=a*b+c;
        if (d>d1 && d>d3 && d>d4) {
            System.out.println("a+b*c is greater");
        } else if (d1>d && d1>d3 && d1>d4) {
            System.out.println("c+a/b is greater");
        } else if (d3>d1 && d3>d &&d3>d4) {
            System.out.println("a%b+c is greater");
        }else {
            System.out.println("a*b+c is greater");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        checkmaxmin(a,b,c);
    }
}
