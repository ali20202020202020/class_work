package com.perscholas.java_basics;

public class PractiseAssignmentOperatorsAndNumbers {

    public static void main(String[] args) {

        /*
        Write a program that declares an integer a variable x,
        assigns the value 2 to it, and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        Now, use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing the results,
        write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
        Perform the preceding exercise with the following values:
        9
        17
        88

         */

        int x = 2;
        System.out.println(Integer.toBinaryString(x));

        x = x << 1;
        // result going to be 4 and binary is 100
        System.out.println(Integer.toBinaryString(x));

        int y = 9;
        System.out.println(Integer.toBinaryString(y));
        y = y << 1;
        System.out.println(Integer.toBinaryString(y));

        int z = 17;
        System.out.println(Integer.toBinaryString(z));
        z = z << 1;
        System.out.println(Integer.toBinaryString(z));

        int k = 88;
        System.out.println(Integer.toBinaryString(k));
        k = k << 1;
        System.out.println(Integer.toBinaryString(k));
        System.out.println(Integer.toBinaryString(k));


//        ===============================================================================================================

        /*
        Write a program that declares a variable x,
        and assigns 150 to it, and prints out the binary string version of the number.
        Now use the right shift operator (>>) to shift by 2 and assign the result to x.
        Write a comment indicating what you anticipate the decimal and binary values to be.
        Now print the value of x and the binary string.
        Perform the preceding exercise with the following values:
        225
        1555
        32456

         */

        int num = 150;
        System.out.println(Integer.toBinaryString(num));
        num = num >> 2;

//        result going to be 37 and 100101
        System.out.println(num);
        System.out.println(Integer.toBinaryString(num));

        int num1 = 225;
        int num2 = 1555;
        int num3 = 32456;

        System.out.println(Integer.toBinaryString(num1));
        num1 = num1 >> 2;


        System.out.println(num1);
        System.out.println(Integer.toBinaryString(num1));

        System.out.println(Integer.toBinaryString(num2));
        num2 = num2 >> 2;


        System.out.println(num2);
        System.out.println(Integer.toBinaryString(num2));

        System.out.println(Integer.toBinaryString(num3));
        num3 = num3 >> 2;


        System.out.println(num3);
        System.out.println(Integer.toBinaryString(num3));


//        =========================================================================================================

        /*
        Write a program that declares three int variables:
        x, y, and z. Assign 7 to x and 17 to y.
        Write a comment that indicates what you predict will be the result of the bitwise and operation on x and y.
        Now use the bitwise AND (&) operator to derive the decimal and binary values, and assign the result to z.
         */

        int num4 = 7;
        int num5 = 17;
        int num6;

//        bitwise result going to be :1 and 00000001

        num6 = num4 & num5;
        System.out.println(num6);


//        ==========================================================================================================

        /*
        Now, with the preceding values, use the bitwise and operator to calculate the “or” value between x and y.
        As before, write a comment that indicates what you predict the values to be before printing them out.
         */

//        result is 23 and 10111
        num6 = num4 | num5;
        System.out.println(num6);

//        ===========================================================================================================

        /*
        Write a program that declares an integer variable, assigns a number,
        and uses a postfix increment operator to increase the value.
        Print the value before and after the increment operator
         */

        int num7 = 11;
        System.out.println(num7);
        num7++;
        System.out.println(num7);

//        =============================================================================================================

        /*
        Write a program that demonstrates at least three ways to increment a variable by 1 and does this multiple times.
        Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again
         */

        int num8 = 20;
        num8++;
        System.out.println(num8);
        num8+=1;
        System.out.println(num8);
        ++num8;
        System.out.println(num8);

//        ==============================================================================================================
        /*
        Write a program that declares two integer variables: x, and y, and then assigns 5 to x and 8 to y.
        Create another variable sum and assign the value of ++x added to y, and print the result.
        Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++) and re-run the program.
        Notice what the value of the sum is. The first configuration incremented x, and then calculated the sum,
        while the second configuration calculated the sum, and then incremented x.
         */

        int num9 = 5;
        int num10 = 8;
        int num11 = ++num9 + num10;
        System.out.println(num11);
//        result is 14
        num11 = num9++ + num10;
        System.out.println(num11);

       Integer val= 50;
        System.out.println(val);
 String a = "ali";
 String b = "ali";
 String c = new String("ali");
        System.out.println((a.equals(c)));
       c.replace(c, "re");
        System.out.println(c);

    }
}
