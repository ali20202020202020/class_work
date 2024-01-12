package com.perscholas.java_basics;

import java.util.Arrays;

public class SplitMethodDemo {
    public static void main(String[] args) {
        String vowels = "a::b::c::d:e";
       String[] result = vowels.split("::");
        System.out.println(Arrays.toString(result));
    }
}
