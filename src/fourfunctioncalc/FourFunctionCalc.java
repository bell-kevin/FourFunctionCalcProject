/** ****************************************************************************
 * FourFunctionCalc.java
 * Kevin Bell
 * This program is designed to add, subtract, multiply, and divide 2 numbers
 * supplied by the user
 ***************************************************************************** */
package fourfunctioncalc;

import java.util.*; //Scanner

public class FourFunctionCalc {

    public static void main(String[] args) {

        Scanner computerKeyboardInput = new Scanner(System.in);
        int num1, num2; //user input

        System.out.println("Calculator Functions by Kevin Bell\n");
        do {
            System.out.print("Enter first number: ");
            num1 = Integer.parseInt(computerKeyboardInput.nextLine());
            System.out.print("Enter second number: ");
            num2 = Integer.parseInt(computerKeyboardInput.nextLine());
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
        return (double) num1 / num2; //cast to double to force floating point division
    } //end divide
} //end class FourFunctionCalc
