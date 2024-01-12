package day_six;

import java.util.Scanner;

public class ControlFlowPA {
    public static void main(String[] args) {

        /*
        Write a program that declares 1 integer variable x,
        and then assigns 7 to it. Write an if statement to print out “Less than 10” if x is less than 10.
        Change x to equal 15, and notice the result (console should not display anything).
         */

       // int x = 7;
        int x = 15;
        if(x < 10){
            System.out.println("Less than 10");
        }
        /*
        Write a program that declares 1 integer variable x, and then assigns 7 to it.
        Write an if-else statement that prints out “Less than 10” if x is less than 10,
        and “Greater than 10” if x is greater than 10. Change x to 15 and notice the result.
         */

       // int x1 = 7;
        int x1 = 15;
        if (x1 == 10) {
            System.out.println("Less than 10");
        }
        else
            System.out.println("Greater than 10");


        /*
         Write a program that declares 1 integer variable x,
         and then assigns 15 to it. Write an if-else-if statement that prints out “Less than 10” if x is less than 10;
         “Between 10 and 20” if x is greater than 10 but less than 20, and “Greater than or equal to 20” if x is greater than or equal to 20.
         Change x to 50 and notice the result.
         */

        //int x2 = 15;
        int x2 = 50;
        if( x2 < 10){
            System.out.println("Less than 10");
        }
        else if(x2 >10 && x2 < 20){
            System.out.println("Between 10 and 20");
        }
        else if(x2 >= 20){
            System.out.println("Greater than or equal to 20");
        }


        /*
         Write a program that declares 1 integer variable x,
         and then assigns 15 to it. Write an if-else statement that prints “Out of range”
         if the number is less than 10 or greater than 20 and prints “In range” if the number is between 10 and 20 (including equal to 10 or 20).
         Change x to 5 and notice the result.
         */


        //int x3 = 15;
        int x3 = 5;
        if(x3 <10 && x3 > 20){
            System.out.println("Out of range");
        }
        else
            System.out.println("In range");

        /*
        Write a program that uses if-else-if statements to print out grades A, B, C, D, F, according to the following criteria:
        A: 90-100
        B: 80-89
        C: 70-79
        D: 60-69
        F: <60
        Use the Scanner class to accept a number score from the user to determine the letter grade.
        Print out “Score out of range” if the score is less than 0 or greater than 100.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your score here: ");
        int score = input.nextInt();

        if(score >= 90 && score <= 100){
            System.out.println("A");
        }
        else if(score >= 80 && score <= 89){
            System.out.println("B");
        }
        else if(score >= 79 && score <= 79){
            System.out.println("C");
        }
        else if(score >= 60 && score <= 69){
            System.out.println("D");
        }
        else if(score >=0 && score >= 59){
            System.out.println("F");
        }
        else
            System.out.println("Score out of range");

        /*
        Write a program that accepts an integer between 1 and 7 from the user.
        Use a switch statement to print out the corresponding weekday.
        Print “Out of range” if the number is less than 1 or greater than 7.
        Do not forget to include “break” statements in each of your cases.
         */

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter a number between 1 - 7");

        int score1 = input1.nextInt();
        switch (score1){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Out of range");
        }


        /*
        Create a program that lets the users input their filing status and income. Display how much tax the user would have to pay according to status and income.
        The U.S. federal personal income tax is calculated based on the filing status and taxable income.
        There are four filing statuses: Single, Married Filing Jointly, Married Filing Separately, and Head of Household.
        The tax rates for 2009 are shown below.
         */
        double tax;
        Scanner input3 = new Scanner(System.in);

        System.out.println("Please enter a number to specify your tax filling status as above:\n" +
                "if it is SINGLE press 1 \n" +
                "if it is Married Filing Jointly press 2 \n" +
                "if it is Married Filing Separately press 3 \n" +
                "if it is Head OF Household press 4");
        int taxFillingStatus = input3.nextInt();
      if((taxFillingStatus <1 && taxFillingStatus > 4) ) {
          System.out.println("Your input is not correct!");
      }
        System.out.println("please enter your income here: ");
      int income = input3.nextInt();

      if (taxFillingStatus == 1 ) {
          if (income >= 0 && income <= 8350) {
              tax = income * 0.10;
              System.out.println(tax);
          } else if (income >= 8351 && income <= 33950) {
              tax = income * 0.15;
              System.out.println(tax);
          } else if (income >= 33950 && income <= 82250) {
              tax = income * 0.25;
              System.out.println(tax);
          } else if (income >= 82251 && income <= 171550) {
              tax = income * 0.28;
              System.out.println(tax);
          } else if (income >= 171550 && income <= 372950) {
              tax = income * 0.33;
              System.out.println(tax);
          } else if (income > 372950) {
              tax = income * 0.35;
              System.out.println(tax);
          }

          else {
              System.out.println("You enter an invalid number!");
          }
      }

        if (taxFillingStatus == 2 ){
            if(income >= 0 && income <= 16700){
                tax = income * 0.10;
                System.out.println(tax);
            }
            else if(income >= 16701 && income <= 67900){
                tax = income * 0.15;
                System.out.println(tax);
            }
            else if(income >= 67901 && income <= 137050){
                tax = income * 0.25;
                System.out.println(tax);
            }
            else if(income >= 137051 && income <= 208850){
                tax = income * 0.28;
                System.out.println(tax);
            }
            else if(income >= 208851 && income <= 372950){
                tax = income * 0.33;
                System.out.println(tax);
            }
            else if(income >372950){
                tax = income * 0.35;
            }

            else {
                System.out.println("You enter an invalid number!");
            }
        }

        if (taxFillingStatus == 3 ){
            if(income >= 0 && income <= 8350){
                tax = income * 0.10;
                System.out.println(tax);
            }
            else if(income >= 8351 && income <= 33950){
                tax = income * 0.15;
                System.out.println(tax);
            }
            else if(income >= 33950 && income <= 68528){
                tax = income * 0.25;
                System.out.println(tax);
            }
            else if(income >= 68529 && income <= 104425){
                tax = income * 0.28;
                System.out.println(tax);
            }
            else if(income >= 104426 && income <= 186475){
                tax = income * 0.33;
                System.out.println(tax);
            }
            else if(income >186475){
                tax = income * 0.35;
                System.out.println(tax);
            }
            else {
                System.out.println("You enter an invalid number!");
            }
        }

        if (taxFillingStatus == 4 ){
            if(income >= 0 && income <= 11950){
                tax = income * 0.10;
                System.out.println(tax);
            }
            else if(income >= 11951 && income <= 33950){
                tax = income * 0.15;
                System.out.println(tax);
            }
            else if(income >= 33950 && income <= 45500){
                tax = income * 0.25;
                System.out.println(tax);
            }
            else if(income >= 45501 && income <= 117450){
                tax = income * 0.28;
                System.out.println(tax);
            }
            else if(income >= 117451 && income <= 190200){
                tax = income * 0.33;
                System.out.println(tax);
            }
            else if(income >190200){
                tax = income * 0.35;
                System.out.println(tax);
            }
            else {
                System.out.println("You enter an invalid number!");
            }

        }
        input3.close();

    }
}
