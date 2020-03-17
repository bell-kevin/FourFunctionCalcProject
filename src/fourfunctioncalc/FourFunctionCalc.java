package fourfunctioncalc;

/******************************************************************************
* FourFunctionCalc.java 
* Programmer: @author jcboyd
* Version: 1.0
* Course: SDEV 2210
* This program is designed to add, subtract, multiply, and divide 2 numbers
* supplied by the user
******************************************************************************/

import java.util.*; //Scanner

public class FourFunctionCalc {
    
    public static void main(String[] args) {
       
        Scanner stdIn = new Scanner(System.in);
        int num1, num2; //user input

        System.out.println("Calculator Functions by JC Boyd\n");
        do {        
            System.out.print("Enter first number: ");        
            num1 = Integer.parseInt(stdIn.nextLine());
            System.out.print("Enter second number: ");        
            num2 = Integer.parseInt(stdIn.nextLine());
        } while (num1 < -99 | num1 > 99 | num2 < -99 | num2 > 99 | num2 == 0);
                
        System.out.printf("%24s = %-10d\n", "Result of addition", add(num1, num2));
        System.out.printf("%24s = %-10d\n", "Result of subtraction", subtract(num1, num2));
        System.out.printf("%24s = %-10d\n", "Result of multiplication", multiply(num1, num2));
        System.out.printf("%24s = %-10.2f\n", "Result of division", divide(num1, num2));
        
    } //end main
    
    public static int add(int num1, int num2) {
        return num1 + num2;
    } //end add
    
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    } //end subtract
    
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    } //end multiply
    
    public static double divide(int num1, int num2) {
        return num1 / num2;
    } //end divide
        
} //end class FourFunctionCalc
