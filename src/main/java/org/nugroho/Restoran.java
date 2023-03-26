package org.nugroho;
import java.util.Scanner;

public class Restoran {
    public static void main(String[] args) {
        Double HNGoreng =9999.99;
        Double HAyamB = 12345.67;
        Double HSteak = 21108.40;
        Double HKwetiaw = 13579.13;
        Double HKambing = 98765.45;

        Scanner input = new Scanner(System.in);
        System.out.println("Selamat siang...");
        System.out.println("Pesan untuk berapa orang :");
        Integer JOrang = input.nextInt();
        System.out.println("Pesanan atas nama        :");
        String nama = input.next();
        System.out.println("Menu Spesial hari ini");
        System.out.println("=====================");
        System.out.println("   1. Nasi Goreng Spesial               @ Rp.   " + HNGoreng);
        System.out.println("   2. Ayam Bakar Spesial                @ Rp.  " + HAyamB);
        System.out.println("   3. Steak Sirloin Spesial             @ Rp.  " + HSteak);
        System.out.println("   4. Kwetiaw Siram Spesial             @ Rp.  " + HKwetiaw);
        System.out.println("   5. Kambing Guling Spesial            @ Rp.  " + HKambing);

        System.out.println("Pesanan Anda [batas pesanan 0-10 porsi");
        System.out.println("1. Nasi Goreng Spesial    =");
        Integer PNGoreng = input.nextInt();
        System.out.println("2. Ayam Bakar Spesial     =");
        Integer PAyamB = input.nextInt();
        System.out.println("3. Steak Sirloin Spesial  =");
        Integer PSteak = input.nextInt();
        System.out.println("4. Kwetiaw Siram Spesial  =");
        Integer PKwetiaw = input.nextInt();
        System.out.println("5. Kambing Guling Spesial =");
        Integer PKambing = input.nextInt();


        System.out.println("Selamat menikmati makanan anda");
        System.out.println("Pembelian :");
        Double JNGoreng = (double) Math.round((HNGoreng * PNGoreng)*100)/100;
        Double JAyamB = (double) Math.round((HAyamB * PAyamB)*100)/100;
        Double JSteak = (double) Math.round((HSteak * PSteak)*100)/100;
        Double JKwetiaw = (double) Math.round((HKwetiaw * PKwetiaw)*100)/100;
        Double JKambing = (double) Math.round((HKambing * PKambing)*100)/100;
        Double Total = (double) Math.round((JNGoreng + JAyamB + JSteak + JKwetiaw + JKambing)*100)/100;
        Double Disc = (double) Math.round((Total * 0.1)*100)/100;
        System.out.println("1. Nasi Ayam Goreng Spesial    " + PNGoreng + " porsi * Rp.   " + HNGoreng + "= Rp.   " + JNGoreng);
        System.out.println("2. Ayam Bakar Spesial          " + PAyamB + " porsi * Rp.  " + HAyamB + "= Rp.   " + JAyamB);
        System.out.println("3. Steak Sirloin Spesial       " + PSteak + " porsi * Rp.  " + HSteak + " = Rp.  " + JSteak);
        System.out.println("4. Kwetiaw Siram Spesial       " + PKwetiaw + " porsi * Rp.  " + HKwetiaw + "= Rp.   " + JKwetiaw);
        System.out.println("5. Kambing Guling Spesial      " + PKambing + " porsi * Rp.  " + HKambing + "= Rp.   " + JKambing +"  +");
        System.out.println("====================================================================================");
        System.out.println("Total Pembelian                                         = Rp.  " + Total);
        System.out.println("Disc. 10 % <Masa Promosi>                               = Rp.  " + Disc);
        System.out.println("====================================================================================");
        Double HJadi = Total-Disc;
        System.out.println("Total Pembelian setelah disc 10 %                        = Rp.  " + HJadi);
        System.out.println("Pembelian per orang <untuk " + JOrang + " orang>                      = Rp.   " + (Total - Disc)/JOrang);
        System.out.println("Terima kasih atas kunjungan Anda...");
        System.out.println("... tekan ENTER untuk keluar...");
    }
}