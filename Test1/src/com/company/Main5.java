package com.company;

import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        int[] array = {188, 181, 156, 162, 171, 152, 169, 193, 185, 183};
        int max = array[0];
        for(int i= 0; i < array.length; i++){
            if (array[i]> max){
                max = array[i];
                int indexMax = i;

                System.out.println(indexMax);
            }

        }
    }
}