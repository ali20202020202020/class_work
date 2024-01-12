package day_seven;

import java.util.Scanner;

public class LoopsPA {
    public static void main(String[] args) {
//        Write a program that uses nested for loops to print a multiplication table
        int col = 12;
        int row = 12;

        // nested loop
        for(int i = 1 ; i <= col; i++){
            for(int j =1; j <= row; j++){
                System.out.format("%-5d",i * j);

            }
            System.out.println();
        }

//        ---------------------------------------------------------------------------------
        /*
        Find The Greatest Common Divisor
        Write a program that prompts the user to enter two positive integers,
        and find their greatest common divisor (GCD).
        Examples:
        Enter 2 and 4. The gcd is 2.
        Enter 16 and 24.  The gcd is 8.
        How do you find the gcd?
        Name the two input integers n1 and n2.
        You know number 1 is a common divisor, but it may not be the gcd.
        Check whether k (for k = 2, 3, 4, and so on) is a common divisor for n1 and n2, until k is greater than n1 or n2.
         */

//        Asks user to input 2 positive integer
        Scanner input = new Scanner(System.in);
        int counter = 0;
        int[] numbers= new int[2];
        int GCD = 0;
        System.out.println("Please enter 2 positive number here: ");
        while (counter < 2){
            int a = input.nextInt();
            if( a>0){
                numbers[counter] = a;
                counter++;
            }
            else
                System.out.println("The number is negative! TRY AGAIN!");
        }

        int a = numbers[0];
        int b = numbers[1];
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println("The GCD is " +a);

        /*
        Predict future Tuition
        Suppose the tuition for a university is $10,000 for the current year and increases by 7 percent every year.
        In how many years will the tuition be doubled?

         */

        double tuition = 10000;
        double increaseRate= 0.07;
        int counter1=0;

        while(tuition <=20000){
          tuition = tuition + (tuition * increaseRate);
            counter1++;

        }
        System.out.println(counter1);


    }
}
