package com.company;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Please some number of month");
        int first = scn.nextInt();
        switch (first) {
            case 1 -> System.out.println("first is January");
            case 2 -> System.out.println("first is February");
            case 3 -> System.out.println("first is March");
            case 4 -> System.out.println("first is April");
            case 5 -> System.out.println("first is Mai");
            case 6 -> System.out.println("first is June");
            case 7 -> System.out.println("first is July");
            case 8 -> System.out.println("first is August");
            case 9 -> System.out.println("first is September");
            case 10 -> System.out.println("first is October");
            case 11 -> System.out.println("first is November");
            case 12 -> System.out.println("first is December");
            default -> System.out.println("wrong number");
        }
    }
}
