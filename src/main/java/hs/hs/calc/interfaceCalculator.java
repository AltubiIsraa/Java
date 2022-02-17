
package hs.hs.calc;
import java.io.*;
import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

public class interfaceCalculator {

    public static void main(String[] args)
    {
                /**
         * @author Israa
         * @since 1.5
         */
        /**
         * Storing the numbers
         */
        double fno, sno;
  
        /**
         * Taking the numbers from user
         */
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the numbers");
  
        // take the inputs
        fno = sc.nextDouble();
  
        sno = sc.nextDouble();
  
        System.out.println("Enter the operator (+,-,*,/)");
  
        char op = sc.next().charAt(0);
  
        double o = 0;
  
        switch (op) {
  
        // case to add two numbers
        case '+':
  
            o = fno + sno;
  
            break;
  
        // case to subtract two numbers
        case '-':
  
            o = fno - sno;
  
            break;
  
        // case to multiply two numbers
        case '*':
  
            o = fno * sno;
  
            break;
  
        // case to divide two numbers
        case '/':
  
            o = fno / sno;
  
            break;
  
        default:
  
            System.out.println("You enter wrong input");
  
            break;
        }
  
        System.out.println("The final result:");
  
        System.out.println();
  

        /**
         * printing the result
         */
        System.out.println(fno + " " + op + " " + sno
                           + " = " + o);
    }
}
