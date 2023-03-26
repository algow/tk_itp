package org.nugroho;

import java.util.Scanner;

public class bilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean cek = true;
        while (cek) {
            System.out.println("Masukkan Nama Anda [1..25] :");
            String nama = input.nextLine();
            int anama = nama.length();
            if (anama <= 25)
                cek = false;
            else
                cek = true;
            boolean cek2 = true;
            while (cek2) {
                System.out.println("Masukkan NIM Anda [harus 10 karakter] :");
                String nim = input.nextLine();
                int anim = nim.length();
                if (anim == 10)
                    cek2 = false;
                else
                    cek2 = true;
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("Registrasi Sukses..");
                System.out.println("Selamat datang " + nama + "[NIM : " + nim + "].. ^^v");
                System.out.println("Mari belajar macam-macam deret bilangan...");
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                System.out.println("Masukkan Sembarang Angka [5...20] :");
                boolean cek3 = true;
                while (cek3) {
                    int angka = input.nextInt();
                    if ((angka <= 20) && (angka >= 5))
                        cek3 = false;
                    else
                        cek3 = true;
                    System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
                    System.out.println("Deret Bilangan");
                    System.out.println("###################");
                    System.out.println(angka + " Bilangan Genap :");
                    int genap = 1;
                    int jumlah = 0;
                    while (true) {
                        if (genap % 2 == 0) {
                            System.out.println(genap + " ");
                            jumlah++;
                            if (jumlah == angka) break;
                        }
                        genap++;
                    }
                    System.out.println("Hasil Penjumlahan = " + (angka / 2 * (2 + genap)));
                    System.out.println(angka + " Bilangan Ganjil :");
                    int ganjil = 1;
                    int jumlah1 = 0;
                    while (true) {
                        if (ganjil % 2 == 1) {
                            System.out.println(ganjil + " ");
                            jumlah1++;
                            if (jumlah1 == angka) break;
                        }
                        ganjil++;
                    }
                    System.out.println("Hasil Penjumlahan = " + (angka / 2 * (1 + ganjil)));
                    System.out.println(angka + " Bilangan Fibonacci :");
                    int fibo = 1;
                    int fibo2 = 1;
                    for (int i = 1; i <= angka; i++) {
                        System.out.println(fibo + " ");
                        int sum = fibo + fibo2;
                        fibo = fibo2;
                        fibo2 = sum;
                    }
                }
            }
        }
    }
}
