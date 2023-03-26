package org.hartomoro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in); // untuk penjumlahan menu agar maximal 10


        System.out.println("Selamat Siang...");

        System.out.print("Pesanan atas nama : ");
        String namaPemesan = input.nextLine();

        System.out.print("Masukkan jumlah orang: ");
        int jumlahOrang = input.nextInt();

        System.out.println("\n");

        // Tampilkan menu makanan
        System.out.println("Menu Spesial hari Ini :");
        System.out.println("=======================");
        System.out.println("1. Nasi Goreng Spesial (Rp. 9999.99)");
        System.out.println("2. Ayam Bakar Spesial (Rp. 12345.67)");
        System.out.println("3. Steak Sirloin Spesial (Rp. 21108.40)");
        System.out.println("4. Kwetiaw Siram Spesial (Rp. 13579.13)");
        System.out.println("5. Kambing Guling Spesial (Rp. 98765.43)");
        System.out.println("\n");

        System.out.println("Pesanan anda [batas pesanan 1-10 porsi]");
        // Input jumlah pesanan masing-masing menu
        System.out.print("1. Nasi Goreng Spesial: ");
        int nasiGoreng = input.nextInt();
        System.out.print("2. Ayam Bakar Spesial: ");
        int ayamBakar = input.nextInt();
        System.out.print("3. Steak Sirloin Spesial: ");
        int steakSirloin = input.nextInt();
        System.out.print("4. Kwetiaw Siram Spesial: ");
        int kwetiawSiram = input.nextInt();
        System.out.print("5. Kambing Guling Spesial: ");
        int kambingGuling = input.nextInt();

        int total = nasiGoreng + ayamBakar + steakSirloin + kwetiawSiram + kambingGuling;


        System.out.println("\n");

        if (total < 10) {
            System.out.println("total pesanan : " + total);
        } else {
            System.out.println("anda telah mencapai pesanan maksimal");
            System.exit(0);
        }


        DecimalFormat df = new DecimalFormat("#.##");

        // Hitung harga pembelian dari masing-masing menu
        double hargaNasiGoreng = nasiGoreng * 9999.99;
        double hargaAyamBakar = ayamBakar * 12345.67;
        double hargaSteakSirloin = steakSirloin * 21108.40;
        double hargaKwetiawSiram = kwetiawSiram * 13579.13;
        double hargaKambingGuling = kambingGuling * 98765.43;

        //buat kemaksimal 2 untuk masing-masing pesanan
        String formatted1 = df.format(hargaNasiGoreng);
        String formatted2 = df.format(hargaAyamBakar);
        String formatted3 = df.format(hargaSteakSirloin);
        String formatted4 = df.format(hargaKwetiawSiram);
        String formatted5 = df.format(hargaKambingGuling);


        // Hitung total pembelian
        double totalPembelian = hargaNasiGoreng + hargaAyamBakar + hargaSteakSirloin
                + hargaKwetiawSiram + hargaKambingGuling;


        // Hitung harga diskon
        double hargaDiskon = totalPembelian / 10;


        // Hitung total pembelian setelah diskon
        double totalPembelianSetelahDiskon = totalPembelian - hargaDiskon;


        // Hitung pembelian per orang
        double pembelianPerOrang = totalPembelianSetelahDiskon / jumlahOrang;


        String formatted6 = df.format(totalPembelian);
        String formatted7 = df.format(hargaDiskon);
        String formatted8 = df.format(totalPembelianSetelahDiskon);
        String formatted9 = df.format(pembelianPerOrang);
        System.out.println("\n");


        System.out.println("Selamat menikmati makanan anda...");

        System.out.println("Pembelian :");
        System.out.println("1. Nasi Goreng Spesial        : " + nasiGoreng + " porsi " + " * Rp. 9999.99 = " + String.format("%.2f", hargaNasiGoreng));
        System.out.println("2. Ayam Bakar Spesial         : " + ayamBakar +  " porsi " + " * Rp. 12345.67 = "+ String.format("%.2f", hargaAyamBakar));
        System.out.println("3. Steak Sirloin Spesial      : " + steakSirloin + " porsi " +  " * Rp. 21108.40 = "+ String.format("%.2f", hargaSteakSirloin));
        System.out.println("4. Kwetiaw Siram Spesial      : " + kwetiawSiram +  " porsi " + " * Rp. 13579.13 = "+ String.format("%.2f", hargaKwetiawSiram));
        System.out.println("5. Kambing Guling Spesial     : " + kambingGuling +  " porsi " + " * Rp. 13579.13 = "+ String.format("%.2f", hargaKambingGuling) + "   + ");
        System.out.println("=========================================================================");
        System.out.println("Total Pembelian " + String.format("%.2f", totalPembelian));
        System.out.println("\n");
        System.out.println("Dics 10 % (Masa Promosi) : " + String.format("%.2f", hargaDiskon) +"                                  -");
        System.out.println("=========================================================================");
        System.out.println("Total Pembelian setelah Diskon 10 persen :" + String.format("%.2f", totalPembelianSetelahDiskon));
        System.out.println("\n");
        System.out.println("=========================================================================");
        System.out.println("Total Harga Perorang :" + String.format("%.2f", pembelianPerOrang));
        System.out.println("\n");
        System.out.println("                 Terima Kasih atas kunjungan anda");
        System.out.println("                  ...Tekan Enter untuk Keluar...");

    }
}
