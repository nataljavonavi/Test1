package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please write the speed of the car");
        int speed = 50;
        speed = scn.nextInt();
        if (speed < 50) {
            System.out.println("нарушений нет");
        } else if (speed > 50 && speed <= 59) {
            System.out.println("выговор");
        } else if (speed > 60 && speed < 80 ) {
            System.out.println("штраф 20$");
        } else {
            if (speed > 80) {
                System.out.print("лишение прав");
            }
        }
    }
}
