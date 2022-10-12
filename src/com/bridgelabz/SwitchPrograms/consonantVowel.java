package com.bridgelabz.SwitchPrograms;

import java.util.Scanner;

public class consonantVowel {
    static void checkalphabet(char apha){
        if (apha=='A'||apha=='a'||apha=='E'||apha=='e'||apha=='I'||apha=='i'||apha=='o'||apha=='O'||apha=='U'||apha=='u') {
            System.out.println("-------------------");
            System.out.println(apha+" is Vowel.");
        }else {
            System.out.println("----------------");
            System.out.println(apha+" is Consonant.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Alphabet: ");
        char alpha=sc.next().charAt(0);
        checkalphabet(alpha);
    }
}
