package com.lfa.day1;
import java.util.Scanner;

public class Rectangle {

public static void main(String [] args){
Scanner input=new Scanner (System.in);
 System.out.println("Enter the value of Length");
    float l = input.nextFloat();
System.out.println("Enter the value of breadth");
    float b = input.nextFloat();
System.out.println("Enter the value of height");
    float h = input.nextFloat();
float Area = l*b ;
float Volume = l*b*h;
float Cube = l*l*l;
float Perimeter = 2*l + 2*b;
float Square = l*l ;

    System.out.println("The value of Area is:" +Area);
    System.out.println("The value of Volume is:" +Volume);
    System.out.println("The value of Cube is:" +Cube);
    System.out.println("The value of Perimeter is:" +Perimeter);
    System.out.println("The value of Square is:" +Square);

}
}
