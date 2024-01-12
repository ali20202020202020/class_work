package com.perscholas.java_basics;

public class JavaBasicClass {
    public static void main(String[] args) {
        //declare variables
        int a = 4;
        int b = 5;
        int sum = a + b;

        //Print the result
        System.out.println("The sum of a and b is equal to = " + sum);

//        ========================================================================================
        /*
        Write a program that declares two double variables, assigns a number to each,
        and adds them together. Assign the sum to a variable. Print out the result.
         */


        double num1 = 3.4;
        double num2 = 4.3;
        double sumDoubles = num1 + num2;
        System.out.println("The sum of num1 and num2 is equal to = " + sumDoubles);



//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

        /*
        Write a program that declares an integer variable and a double variable,
        assigns numbers to each, and adds them together. Assign the sum to a variable.
        Print out the result. What variable type must the sum be?
         */

        int num3 = 9;
        double num4 = 8.6;

        double sumOfIntAndDouble = num3 + num4;
        System.out.println("Sum of num3 and num4 is = " + sumOfIntAndDouble);

//        --------------------------------------------------------------------------------------------------------

        /*
        Write a program that declares two integer variables, assigns an integer to each, and divides the larger number by the smaller number.
        Assign the result to a variable. Print out the result. Now change the larger number to a decimal.
        What happens? What corrections are needed?
         */

//        After changing the num5 to a decimal it  gives an error and needed to change the data type to double
        double num5 = 99.5;
        int num6 = 4;
        double resultOfDivision = num5 / num6 ;
        System.out.println("The result of num5 divided by num6 is : " + resultOfDivision);

//        \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

        /*
        Write a program that declares two double variables, assigns a number to each, and divides the larger by the smaller number.
        Assign the result to a variable. Print out the result. Now, cast the result to an integer. Print out the result again.
         */

        double num7 = 5.4;
        double num8 = 400.665;
        double resultOfDivisionOfTwoDoubles = num8 / num7;

//        After casting the result it changed to an int value without any decimal point
        System.out.println("The result is = " + (int)resultOfDivisionOfTwoDoubles);



//        ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        /*
        Write a program that declares two integer variables, x and y, and assigns the number 5 to x and the number 6 to y.
        Declare a variable q and assign y/x to it and print q. Now, cast y to a double and assign it to q. Print q again.
         */

        int x = 5;
        int y = 6;

        double q = y/x;
        System.out.println("The result is = "+ q);

        q = (double)y;
        System.out.println("The result after casting y to double is : "+ q);
//        result changed after casting



//        ======================================================================================================================

        /*
        Write a program that declares a named constant and uses it in a calculation. Print the result.
         */

        final int NUMBER_OF_DAYS_IN_YEAR = 365;
        int age = 23;
        int ageInDays = NUMBER_OF_DAYS_IN_YEAR * age;
        System.out.println("Your age is " + ageInDays+ " days");


//===============================================================================================================================

/*
Write a program where you create three variables that represent products at a cafe.
The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
Assign prices to each product. Create two more variables called subtotal and totalSale and complete an “order” for three items of the first product,
four items of the second product, and two items of the third product. Add them all together to calculate the subtotal.
Create a constant called SALES_TAX and add sales tax to the subtotal to obtain the totalSale amount. Be sure to format the results to two decimal places.
 */


double tea = 2.44;
double espresso = 3.45;
double cupCake = 1.99;
final double SALES_TAX = 0.05;
double subtotal = (3 * tea) + (4 * espresso) + (2 * cupCake);
double totalSale = SALES_TAX * subtotal;
System.out.printf("The result is : %.2f", totalSale);


        int gh=3;
        System.out.println(--gh);
        System.out.println(gh);



    }
}
