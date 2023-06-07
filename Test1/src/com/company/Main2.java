package com.company;

public class Main2 {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println(Math.round(Math.random() *100) + 100);
            i++;
            if (i ==10) {
                break;
            }
        }
    }
}










            //int num2 = (int) Math.round(Math.random() * 200);
                //System.out.println(num2);