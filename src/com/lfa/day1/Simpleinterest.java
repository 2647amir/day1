package com.lfa.day1;
import java.util.Scanner;
public class Simpleinterest{
    public static void main (String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the value of Principal");
            int p = input.nextInt();

            System.out.println("Enter the value of Time");
            int t = input.nextInt();

            System.out.println("Enter the value of Rate");
            float r = input.nextFloat();

            float interest = p*t*r/100;
            System.out.println("Simple Interest is:" + interest);

    }
}