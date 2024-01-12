package day_six;

import java.util.Scanner;

public class LoopGlab {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            System.out.println("Java is fun!");
        }

        //Display sum of n natural numbers
        int sum = 0;
        int number = 1000;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("Sum = " + sum);
        //Palindrome

        String originalNumber;
        String reversedNumber = "";

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number here:");
        originalNumber = input.nextLine();

        for(int i= originalNumber.length()-1; i >= 0;i--){
            reversedNumber += originalNumber.charAt(i);
        }

        if(originalNumber.equals(reversedNumber)){
            System.out.println("This number is Palindrome");
        }
        else
            System.out.println("This is not Palindrome!");

        //Pyramid
        for(int i =1 ; i <= 5 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
