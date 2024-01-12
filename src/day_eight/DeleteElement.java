package day_eight;

import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = new int[first.length - 1];
        int numDelete = 1;

        int j = 0;

        for (int i = 0; i < first.length; i++) {
            if (first[i] != numDelete) {
                second[j] = first[i];
                j++;
            }}

            System.out.println(Arrays.toString(first));
            System.out.println(Arrays.toString(second));


    }}
