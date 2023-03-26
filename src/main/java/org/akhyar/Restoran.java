package org.akhyar;

import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input jumlah orang dan nama pemesan
        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = input.nextInt();
        System.out.print("Masukkan nama pemesan: ");
        String namaPemesan = input.next();

        // Tampilkan menu makanan
        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng Spesial dengan harga Rp. 9999,99");
        System.out.println("2. Ayam Bakar Spesial dengan harga Rp. 12345,67");
        System.out.println("3. Steak Sirloin Spesial dengan harga Rp. 21108,40");
        System.out.println("4. Kwetiaw Siram Spesial dengan harga Rp. 13579,13");
        System.out.println("5. Kambing Guling Spesial dengan harga Rp. 98765,43");

        // Input jumlah pesanan untuk setiap menu
        System.out.print("Masukkan jumlah pesanan untuk Nasi Goreng Spesial: ");
        int jumlahNasiGoreng = input.nextInt();
        System.out.print("Masukkan jumlah pesanan untuk Ayam Bakar Spesial: ");
        int jumlahAyamBakar = input.nextInt();
        System.out.print("Masukkan jumlah pesanan untuk Steak Sirloin Spesial: ");
        int jumlahSteak = input.nextInt();
        System.out.print("Masukkan jumlah pesanan untuk Kwetiaw Siram Spesial: ");
        int jumlahKwetiaw = input.nextInt();
        System.out.print("Masukkan jumlah pesanan untuk Kambing Guling Spesial: ");
        int jumlahKambingGuling = input.nextInt();

        // Hitung harga pembelian dari masing-masing menu
        double hargaNasiGoreng = jumlahNasiGoreng * 9999.99;
        double hargaAyamBakar = jumlahAyamBakar * 12345.67;
        double hargaSteak = jumlahSteak * 21108.40;
        double hargaKwetiaw = jumlahKwetiaw * 13579.13;
        double hargaKambingGuling = jumlahKambingGuling * 98765.43;

        // Hitung total pembelian
        double totalPembelian = hargaNasiGoreng + hargaAyamBakar + hargaSteak + hargaKwetiaw + hargaKambingGuling;

        // Hitung harga diskon dan total pembelian setelah diskon
        double hargaDiskon = totalPembelian * 0.1;
        double totalPembelianSetelahDiskon = totalPembelian - hargaDiskon;

        // Hitung pembelian per orang
        double pembelianPerOrang = totalPembelianSetelahDiskon / jumlahOrang;

        // Tampilkan hasil
        System.out.println("Total pembelian: Rp. " + totalPembelian);
        System.out.println("Harga diskon: Rp. " + hargaDiskon);
        System.out.println("Total pembelian setelah diskon: Rp. " + totalPembelianSetelahDiskon);
        System.out.println("Pembelian per orang: Rp. " + pembelianPerOrang);

    }
}
