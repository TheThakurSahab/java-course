package Basics;

import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numeric value");
        float num1 = sc.nextFloat();
        System.out.println("Enter a numeric value");
        float num2 = sc.nextFloat();
        System.out.println(String.valueOf(num1/num2));
        }
    }
