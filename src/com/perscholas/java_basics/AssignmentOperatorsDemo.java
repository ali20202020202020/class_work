package com.perscholas.java_basics;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        //Assigning Primitive Values

        int j;
        int k;
        j = 10;
        j = 5;
        k = j;
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        k = j = 10;
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);
    }
}
