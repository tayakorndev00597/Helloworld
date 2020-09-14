package Overloading;

import java.util.Scanner;

public class Overloading {
    //method Overloading
    int sum (int num1,int num2){
      return (num1+num2);
    }
}

class MethodCall {
    public static void main(String[] args) {
        int x,y;
        Scanner number = new Scanner(System.in);

        System.out.print("Please Enter number 1 :");
        x=number.nextInt();

        System.out.print("Please Enter number 2 :");
        y= number.nextInt();

        Overloading ol = new Overloading();

        System.out.print("Result sum is"+ol.sum(x,y) );

    }
}