package com.company;

public class Main3 {

    public static void main(String[] args) {
        int[] numbers = {188, 181, 156, 162, 171, 152, 169, 193, 185, 183};
        int result = 0;
        for(int i =0; i< numbers.length; i++){
            result = numbers[i] + result;
        }
        System.out.println(result);
        int  average  = result / numbers.length;
        System.out.println(average);
    }
    }
