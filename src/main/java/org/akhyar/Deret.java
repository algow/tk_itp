package org.akhyar;

import java.util.Scanner;

public class Deret {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, nim;
        int jumlahAngka, choice;

        do {
            System.out.print("Masukkan Nama (1-25 karakter): ");
            nama = input.nextLine();
        } while (nama.length() < 1 || nama.length() > 25);

        do {
            System.out.print("Masukkan NIM (10 karakter): ");
            nim = input.nextLine();
        } while (nim.length() != 10);

        do {
            System.out.print("Masukkan Jumlah Angka (5-20): ");
            jumlahAngka = input.nextInt();
            input.nextLine();
        } while (jumlahAngka < 5 || jumlahAngka > 20);

        System.out.println("Deret Bilangan Genap:");
        int sumGenap = 0;
        for (int i = 1, count = 0; count < jumlahAngka; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                sumGenap += i;
                count++;
            }
        }
        System.out.println("\nJumlah Deret Bilangan Genap: " + sumGenap);

        System.out.println("\nDeret Bilangan Ganjil:");
        int sumGanjil = 0;
        for (int i = 1, count = 0; count < jumlahAngka; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sumGanjil += i;
                count++;
            }
        }
        System.out.println("\nJumlah Deret Bilangan Ganjil: " + sumGanjil);

        System.out.println("\nDeret Bilangan Fibonacci:");
        int sumFibonacci = 0;
        int a = 0, b = 1;
        for (int i = 1; i <= jumlahAngka; i++) {
            System.out.print(a + " ");
            sumFibonacci += a;
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println("\nJumlah Deret Bilangan Fibonacci: " + sumFibonacci);

        do {
            System.out.print("\nUlangi program? (Y/T): ");
            choice = input.nextLine().charAt(0);
        } while (choice != 'Y' && choice != 'y' && choice != 'T' && choice != 't');

        if (choice == 'Y' || choice == 'y') {
            main(args);
        } else {
            System.out.println("\nRegistrasi sukses! Selamat datang \"" + nama + "\" NIM \"" + nim + "\"! ^^v");
            System.out.println("Mari belajar macam-macam deret bilangan!");
        }
    }
}
