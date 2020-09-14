package inputOutput;

import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) {

        int num1,num2,output;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter Number1");
        num1 = number.nextInt();

        System.out.println("Enter Number2");
        num2 = number.nextInt();

        output = num1 + num2;
        System.out.println("Sum = "+output);
    }
}
