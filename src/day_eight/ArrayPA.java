package day_eight;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayPA {
    public static void main(String[] args) {
        /*
        Task 1: Write a program that creates an array of integers with a length of 3.
        Assign the values 1, 2, and 3 to the indexes. Print out each array element
         */

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(arr));


        /*
        Task 2: Write a program that returns the middle element in an array.
        Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
         */

        int[] arr2 = {13,5,7,68,2};
        int midIndex = (arr2.length / 2);
        System.out.println(arr2[midIndex]);


        /*
        Task 3: Write a program that creates an array of String type and initializes it with
        the strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy using the clone( ) method.
        Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
         */

        String[] colors = {"red", "green", "blue", "yellow"};
        System.out.println(colors.length);
        String [] colors2 = colors. clone();
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(colors2));


        /*
        Task 4: Write a program that creates an integer array with 5 elements (i.e., numbers).
        The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index.
        Now try printing the value at index = length (e.g., myArray[myArray.length] ).  Notice the type of exception which is produced.
        Now try to assign a value to the array index 5. You should get the same type of exception.
         */

        int[] arr3 = {5, 4, 87, 95, 1000};
        System.out.println(arr3[0]);
        System.out.println(arr3[arr3.length -1]);
//      System.out.println(arr3[args3.length]); gives error
//        arr3[5] = 9;  ArrayIndexOutOfBoundsException errors



        /*
        Task 5: Write a program where you create an integer array with a length of 5.
        Loop through the array and assign the value of the loop control variable (e.g., i)
        to the corresponding index in the array.
         */

        int[] arr4 = new int[5];
        for(int i = 0; i < arr4.length ; i++){
            arr4[i] = i ;
        }
        System.out.println(Arrays.toString(arr4));


        /*
        Task 6: Write a program where you create an integer array of 5 numbers.
        Loop through the array and assign the value of the loop control variable
        multiplied by 2 to the corresponding index in the array.
         */

        int[] arr5 = new int[5];
        for(int i = 0; i < arr5.length ; i++){
            arr5[i] = i * 2 ;
        }
        System.out.println(Arrays.toString(arr5));

        /*
        Task 7: Write a program where you create an array of 5 elements.
        Loop through the array and print the value of each element,
        except for the middle (index 2) element.
         */

        int[] arr6 = {5, 8, 9,44, 58};
        for(int i = 0; i < arr6.length ; i++){
            int medInx= (arr6.length)/2;
            if(i != medInx){
                System.out.print(arr6[i] + "  ");
            }
        }

       /*
       Task 8: Write a program that creates a String array of 5 elements and
       swaps the first element with the middle element without creating a new array.
        */

        String [] names = {"James" , "Jack" , "Anna" , "Ahmad" ,"Ali"};
        String temp = names[0];
        int meddleIndex = names.length /2;
        names[0] = names[meddleIndex];
        names[meddleIndex] = temp ;
        System.out.println(Arrays.toString(names));




        /*
        Task 9:
        Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}.
        Print the array in ascending order, and print the smallest and the largest element of the array.
        The output will look like the following:
        Array in ascending order: 0, 1, 2, 4, 9, 13
        The smallest number is 0
        The biggest number is 13
         */

        int[] arr7 = {4, 5, 9, 13, 1, 0};
        Arrays.sort(arr7);
        System.out.println("Array in ascending order: " + Arrays.toString(arr7));
        int min = arr7[0];
        int max = arr7[0];

        // Iterate through the array to find min and max
        for (int i = 1; i < arr7.length; i++) {
            if (arr7[i] < min) {
                min = arr7[i];
            } else if (arr7[i] > max) {
                max = arr7[i];
            }
        }

        // Print the min and max values
        System.out.println("The smallest number is: " + min);
        System.out.println("The biggest number is: " + max);



        /*
        Task 10: Create an array that includes an integer, 3 strings, and 1 double. Print the array.
         */

        Object[] mixedArray = {42, "Hello", "World", "Java", 3.14};
        for(Object arr8: mixedArray){
            System.out.print(arr8 + "  ");
        }


        /*
        Task 11: Write some Java code that asks the user how many favorite things they have.
        Based on their answer, you should create a String array of the correct size.
        Then ask the user to enter the things and store them in the array you created.
        Finally, print out the contents of the array.


        Example
        How many favorite things do you have?
        7

        Enter your thing: phone
        Enter your thing: tv
        Enter your thing: xbox
        Enter your thing: wine
        Enter your thing: beer
        Enter your thing: sofa
        Enter your thing: book
        Your favorite  things are:
        phone tv xbox wine beer sofa book

         */
        String[] favoriteThings;
        int numOfFav ;
        Scanner input = new Scanner(System.in);
        System.out.println("How many favorite things do you have?");
        numOfFav = input.nextInt();
        favoriteThings = new String[numOfFav];

        for(int i = 0 ; i < favoriteThings.length; i++){
            System.out.print("Enter your thing: ");
            String temp4 = input.next();
            favoriteThings[i] = temp4;
            System.out.println();
        }

        for (String thing : favoriteThings){
            System.out.print(thing + "  ");
        }






    }
}
