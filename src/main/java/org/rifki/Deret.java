package org.rifki;

import java.util.Scanner;

public class Deret {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ulang = true;

        while (ulang) {
            String name, nim;

            do {
                System.out.print("Masukkan nama anda [Maksimal 25 karakter]: ");
                name = sc.nextLine();
            } while (name.length() < 1 || name.length() > 25);

            do {
                System.out.print("Masukkan NIM anda [harus 10 karakter]: ");
                nim = sc.nextLine();
            } while (nim.length() != 10);

            System.out.println();

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            System.out.println("Registrasi sukses...");
            System.out.println("Selamat datang " + name + " [NIM: " + nim + "]...");
            System.out.println("Mari belajar macam-macam deret bilangan...");

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            System.out.println();

            int num;

            do {
                System.out.println("Masukkan sembarang angka [5-20]: ");
                num = sc.nextInt();
            } while (num < 5 || num > 20);

            System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

            System.out.println("Deret bilangan");
            System.out.println("####################################################");
            System.out.println();

            deretGenap(num);
            System.out.println();

            deretGanjil(num);
            System.out.println();

            deretFibonacci(num);

            sc.nextLine();

            System.out.println("Apakah anda ingin mengulang? [y/t]]: ");
            String yt = sc.nextLine();

            if (yt.equalsIgnoreCase("y")) {
                ulang = true;
            } else {
                ulang = false; System.out.print("Terima Kasih telah menggunakan program ini...");
            }
        }
    }

    private static void deretGenap(int n) {
        int total = 0;

        System.out.println(n + " bilangan genap:");

        for (int i = 1; i <= n; i++) {
            int genap = i * 2;
            total += genap;
            System.out.print(genap + " ");
        }

        System.out.println();
        System.out.println("Hasil penjumlahan " + total);
    }

    private static void deretGanjil(int n) {
        int total = 0;

        System.out.println(n + " bilangan ganjil:");

        for (int i = 0; i < n; i++) {
            int ganjil = 2 * i + 1;
            total += ganjil;
            System.out.print(ganjil + " ");
        }

        System.out.println();
        System.out.println("Hasil penjumlahan " + total);
    }

    private static void deretFibonacci(int n) {
        int total = 0;
        int n1 = 0, n2 = 1;

        System.out.println(n + " bilangan fibonacci:");

        for (int i = 0; i < n-1; i++) {
            System.out.print(n1 + " ");

            int fib = n1 + n2;

            n1 = n2;
            n2 = fib;

            total += fib;
        }

        System.out.println();
        System.out.println("Hasil penjumlahan " + total);
    }
}
