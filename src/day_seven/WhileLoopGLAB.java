package day_seven;

import java.util.Scanner;

public class WhileLoopGLAB {
    public static void main(String[] args) {
        /*
        Guess the number!
            Write a program that randomly generates an integer between 0 and 100,
            inclusive. The program should prompt the user to enter a number repeatedly until the number matches the randomly generated number.
            For each user input, the program tells the user whether the input is too low or too high.
            When the user discovers the correct answer, the program outputs a congratulatory message,
            and then provides the user with the opportunity to play again.
         */
        // Generates a random number between 0 - 100
        int random = (int)((Math.random())*101);
        int number;
        //Creates Scanner Obj
        Scanner input = new Scanner(System.in);



        do{
            //Asks user to input a number and stored it to a variable
            System.out.println("Please enter a number here:");
            number = input.nextInt();
            if(number > random){
                System.out.println("The number is smaller than you guessed!");
            }
            else if(number < random)
                System.out.println("The number is larger than you guessed!");

            else
                System.out.println("Congratiolation you guessed the Number! and number is : " + random );
        } while(random != number);

//        --------------------------------------------------------------------------------------------------------------

        /*
        An Advanced Math tool!
        Write a program that generates five single-digit integer subtraction problems.
        Using a while loop, prompt the user to answer all five problems.
        After all of the answers are entered, report the number of the correct answers.
        Offer the user the opportunity to play the game again.
         */

            final int NUMBER_OF_QUESTIONS = 5;
            int correctCount = 0;
            int count = 0;
            long startTime = System.currentTimeMillis();
            String output = "";
            Scanner input1 = new Scanner(System.in);

            while (count < NUMBER_OF_QUESTIONS) {
                // 1. Generate two random single-digit integers
                int number1 = (int) (Math.random() * 10);
                int number2 = (int) (Math.random() * 10);
                // 2. If number1 < number2, swap number1 with number2
                if (number1 < number2) {
                    int temp = number1;
                    number1 = number2;
                    number2 = temp;
                }
                // 3. Prompt the student to answer "What is number1 - number2?"
                System.out.print(
                        "What is " + number1 + " - " + number2 + "? ");
                int answer = input1.nextInt();
                // 4. Grade the answer and display the result
                if (number1 - number2 == answer) {
                    System.out.println("You are correct!");
                    correctCount++;
                } else
                    System.out.println("Your answer is wrong.\n" + number1
                            + " - " + number2 + " should be " + (number1 - number2));
                // Increase the count
                count++;
                output += "\n" + number1 + "-" + number2 + "=" + answer +
                        ((number1 - number2 == answer) ? " correct" : " wrong");
            }



            /*
            Controlling a loop with a sentinel value
            Write a program that reads and calculates the sum of an unspecified number of integers.
             The input 0 signifies the end of the input.
            If data is not 0, it is added to the sum, and the next input data are read. If data is 0,
            the loop body is not executed, and the while loop terminates.
            If the first input read is 0, the loop body never executes, and the resulting sum is 0.

             */
        // Create a Scanner
        Scanner input3 = new Scanner(System.in);
        // Read an initial data
        System.out.print("Enter an int value (the program exits if the input is 0): ");
        int data = input3.nextInt();
        // Keep reading data until the input is 0
        int sum = 0;
        while (data != 0) {
            sum += data;
            // Read the next data
            System.out.print( "Enter an int value (the program exits if the input is 0): ");
            data = input3.nextInt();
        }
        System.out.println("The sum is " + sum);


    }
    }

