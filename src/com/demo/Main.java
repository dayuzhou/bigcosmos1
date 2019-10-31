package com.demo;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            for (int a = 4; a >= i; a--) {
                System.out.print(" ");
            }
            for (int y = 1; y <= i * 2 - 1; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
