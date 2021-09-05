/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Trae Roy
 */

import java.util.Scanner;

public class Solution05 {
    /*
    You’ll often write programs that deal with numbers.
    And depending on the programming language you use, you’ll have to convert the
    inputs you get to numerical data types.

    Write a program
    Scanner 'num1Input' = new scanner for first number from user
    Scanner 'num2Input' = new scanner for second number from user
    print 'What is the first number? '
    String 'num1' = scan first number input using 'num1Input' scanner
    print 'What is the second number? '
    String 'num2' = scan second number input using 'num2Input' scanner
    int 'number1' = convert 'num1' string to integer 'number1'
    int 'number2' = convert 'num2' string to integer 'number2'
    int 'sum' = 'number1' + 'number2'
    int 'difference' = 'number1' - 'number2'
    int 'product' = 'number1' * 'number2'
    int 'quotient' = 'number1' / 'number2'
    printf '%s + %s = %d\n%s - %s = %d\n%s * %s = %d\n%s / %s = %d'
    , num1, num2, sum, num1, num2, difference, num1, num2, product,
    num1, num2, quotient
    to utilize one output statement with '\n' for the line breaks after each
    calculation output is printed
    */
    public static void main(String[] args){
        Scanner num1Input = new Scanner(System.in);
        Scanner num2Input = new Scanner(System.in);

        System.out.print("What is the first number? ");
        String num1 = num1Input.next();

        System.out.print("What is the second number? ");
        String num2 = num2Input.next();

        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);

        int sum = number1 + number2;
        int difference = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;

        System.out.printf("%s + %s = %d\n%s - %s = %d\n%s * %s = %d\n%s / %s = %d", num1, num2, sum, num1, num2, difference, num1, num2, product, num1, num2, quotient);
    }
}
