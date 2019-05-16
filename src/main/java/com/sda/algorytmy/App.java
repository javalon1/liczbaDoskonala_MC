package com.sda.algorytmy;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolna liczbe calkowita: ");
        int a = scan.nextInt();

        int sumaDzielnikow = 0;

        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sumaDzielnikow = sumaDzielnikow + i;
            }
        }
        if (sumaDzielnikow == a) {
            System.out.println(a + " jest liczba doskonala");
        } else {
            System.out.println(a + " Nie jest liczba doskonala");
        }
    }
}

