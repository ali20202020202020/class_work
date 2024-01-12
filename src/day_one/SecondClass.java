package day_one;

/**
 * This class allows the calculation of the area of
 * a circle using radius.
 */

//few tips:
  /*  class name is always starts with Capital
    method name = camel case
*/
public class SecondClass {
    //This is the main method
    public static void main(String[] args) {
        //Declare variables
        double radius; //one of the 'integral' types

        //Declare  the area variable
        double area;

        //Assign a value
        radius = 20;

        //Compute area
        area = radius * radius * Math.PI;

        //Display results:
        System.out.println("The area for the circle of " + "radius " +
                radius + "is" + area);

        /*
         all primitive data types store in the stack memory
         and reference data types store in the HEAP memory
         and they point to the
         */



       //Variable naming rules
        //prefer to be camel case style
    /*   String resutl;
        String myResult;
       String _result;
       String my_result;
       String public;  // gives error cause it is a reserved name
       String STATIC = "STATIC REC";
         String rESuLt;
         String RESULT;
         String STATIC2 = "static rec";*/

//        primitive data types
        byte num = 10;
        short yourNum = 3200;
        int myNum = 1000;
        long longNum = 1244556677L; // if a number is larger than the range of int, short and byte you must add L at the end
        float myFloat = 1.001f;
        double myDouble = 1.00000001;

        // final
        final int NUM = 10;


        //Boolean - true or false

        //Character - 15 bit unicode characters : 0 to 65535
        char yourLetter = 54 ;  // going to be the equal char
        System.out.println(yourLetter);
    }
}
