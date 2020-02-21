package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please insert 5 numbers and program will sort them by increasing progression");
        Scanner input = new Scanner(System.in);
        int x1, x2, x3, x4, x5;
        System.out.print("1st number : ");
        x1 = input.nextInt();
        System.out.print("2nd number : ");
        x2 = input.nextInt();
        System.out.print("3th number : ");
        x3 = input.nextInt();
        System.out.print("4th number : ");
        x4 = input.nextInt();
        System.out.print("5th number : ");
        x5 = input.nextInt();

        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;

        if (x1 >= x2 && x1 >= x3 && x1 >= x4 && x1 >= x5) {
            a1 = x1;
            x1 = Integer.MIN_VALUE;
        } else if (x2 >= x1 && x2 >= x3 && x2 >= x4 && x2 >= x5) {
            a1 = x2;
            x2 = Integer.MIN_VALUE;
        } else if (x3 >= x1 && x3 >= x2 && x3 >= x4 && x3 >= x5) {
            a1 = x3;
            x3 = Integer.MIN_VALUE;
        } else if (x4 >= x1 && x4 >= x2 && x4 >= x3 && x4 >= x5) {
            a1 = x4;
            x4 = Integer.MIN_VALUE;
        } else if (x5 >= x1 && x5 >= x2 && x5 >= x3 && x5 >= x4) {
            a1 = x5;
            x5 = Integer.MIN_VALUE;
        }


        if (x1 >= x2 && x1 >= x3 && x1 >= x4 && x1 >= x5) {
            a2 = x1;
            x1 = Integer.MIN_VALUE;
        } else if (x2 >= x1 && x2 >= x3 && x2 >= x4 && x2 >= x5) {
            a2 = x2;
            x2 = Integer.MIN_VALUE;
        } else if (x3 >= x1 && x3 >= x2 && x3 >= x4 && x3 >= x5) {
            a2 = x3;
            x3 = Integer.MIN_VALUE;
        } else if (x4 >= x1 && x4 >= x2 && x4 >= x3 && x4 >= x5) {
            a2 = x4;
            x4 = Integer.MIN_VALUE;
        } else if (x5 >= x1 && x5 >= x2 && x5 >= x3 && x5 >= x4) {
            a2 = x5;
            x5 = Integer.MIN_VALUE;
        }


        if (x1 >= x2 && x1 >= x3 && x1 >= x4 && x1 >= x5) {
            a3 = x1;
            x1 = Integer.MIN_VALUE;
        } else if (x2 >= x1 && x2 >= x3 && x2 >= x4 && x2 >= x5) {
            a3 = x2;
            x2 = Integer.MIN_VALUE;
        } else if (x3 >= x1 && x3 >= x2 && x3 >= x4 && x3 >= x5) {
            a3 = x3;
            x3 = Integer.MIN_VALUE;
        } else if (x4 >= x1 && x4 >= x2 && x4 >= x3 && x4 >= x5) {
            a3 = x4;
            x4 = Integer.MIN_VALUE;
        } else if (x5 >= x1 && x5 >= x2 && x5 >= x3 && x5 >= x4) {
            a3 = x5;
            x5 = Integer.MIN_VALUE;
        }


        if (x1 >= x2 && x1 >= x3 && x1 >= x4 && x1 >= x5) {
            a4 = x1;
            x1 = Integer.MIN_VALUE;
        } else if (x2 >= x1 && x2 >= x3 && x2 >= x4 && x2 >= x5) {
            a4 = x2;
            x2 = Integer.MIN_VALUE;
        } else if (x3 >= x1 && x3 >= x2 && x3 >= x4 && x3 >= x5) {
            a4 = x3;
            x3 = Integer.MIN_VALUE;
        } else if (x4 >= x1 && x4 >= x2 && x4 >= x3 && x4 >= x5) {
            a4 = x4;
            x4 = Integer.MIN_VALUE;
        } else if (x5 >= x1 && x5 >= x2 && x5 >= x3 && x5 >= x4) {
            a4 = x5;
            x5 = Integer.MIN_VALUE;
        }


        if (x1 >= x2 && x1 >= x3 && x1 >= x4 && x1 >= x5) {
            a5 = x1;
            x1 = Integer.MIN_VALUE;
        } else if (x2 >= x1 && x2 >= x3 && x2 >= x4 && x2 >= x5) {
            a5 = x2;
            x2 = Integer.MIN_VALUE;
        } else if (x3 >= x1 && x3 >= x2 && x3 >= x4 && x3 >= x5) {
            a5 = x3;
            x3 = Integer.MIN_VALUE;
        } else if (x4 >= x1 && x4 >= x2 && x4 >= x3 && x4 >= x5) {
            a5 = x4;
            x4 = Integer.MIN_VALUE;
        } else if (x5 >= x1 && x5 >= x2 && x5 >= x3 && x5 >= x4) {
            a5 = x5;
            x5 = Integer.MIN_VALUE;
        }

        System.out.print("increasing Progression : ");
        System.out.println(a5 + " " + a4 + " " + a3 + " " + a2 + " " + a1);

    }
}
