package org.nugroho;
import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
// d e t t l i
        String[] key1 = {"die", "led", "lei", "let", "lid", "lie",
                "lie", "lit", "tie", "deli", "diet", "edit", "idle", "lied", "tide",
                "tied", "tile", "tilt", "tilde", "tiled", "title", "tilted", "titled"
        };

// s e c a e n
        String[] key2 = {"scan", "case", "scene", "can", "case", "seen",
                "sea", "see", "cease", "cane", "sec"
        };
// h k r n e o
        String[] key3 = {"ore", "honk", "her", "hen", "roe", "honker",
                "neo", "one", "hoe", "hone"
        };
        String repetisi;
        boolean val_repetisi=false;
        boolean val_stop=false;
        int minLengthAnswer = 3, maxLengthAnswer=6;
        Scanner input = new Scanner(System.in);
        do {
// variable level 1
            String[] jawabanLv1 = new String[10];
            int jml_jawaban_lv1 = 1;
            int idx_jawaban_lv1 = 0;
            int jml_jawaban_betul_lv1 = 0;
            int score_lv1 = 0;
// variable level 2
            String[] jawabanLv2 = new String[10];
            int jml_jawaban_lv2 = 1;
            int idx_jawaban_lv2 = 0;
            int jml_jawaban_betul_lv2 = 0;
            int score_lv2 = 0;
// variable level 3
            String[] jawabanLv3 = new String[10];
            int jml_jawaban_lv3 = 1;
            int idx_jawaban_lv3 = 0;
            int jml_jawaban_betul_lv3 = 0;
            int score_lv3 = 0;
            int score_all = 0;

// ------------------- Level 1
            boolean ulang2 = true;
            while (ulang2) {

                boolean ulang1 = true;
                while (ulang1) {

                    System.out.println("Coepoe Word Puzzle");
                    System.out.println("==================");

                    System.out.println("Rules:");
                    System.out.println("1. Create a word using given characters, min "
                            + "3 characters & max 6 characters");
                    System.out.println("2. Each level, You have 10 chances to answer "
                            + "correctly.");
                    System.out.println("3. To get through to next level, you have to "
                            + "score 70 each level.");

                    System.out.println("Level 1");
                    System.out.println("-------");

                    System.out.println("\t d \t e \t t "
                            + "\t t \t l \t i");


                    do {
                        boolean answer_valid = false;
                        do {
                            String temp_jawaban;
                            System.out.print(jml_jawaban_lv1 + "> Your Answer : ");
                            temp_jawaban = input.next();
                            if (temp_jawaban.length() <= maxLengthAnswer
                                    && temp_jawaban.length() >= minLengthAnswer) {
                                if (idx_jawaban_lv1 > 0) {
                                    int hasilLinearSearch = linearSearch(jawabanLv1,
                                            temp_jawaban);
                                    if (hasilLinearSearch == 1) {
                                        System.out.println("You had already type this "
                                                + "word before..");
                                    } else {
                                        answer_valid = true;
                                        jawabanLv1[idx_jawaban_lv1] = temp_jawaban;
                                        int hasilBandingJawabanLv1 =
                                                linearSearch(key1, jawabanLv1[idx_jawaban_lv1]);
                                        if (hasilBandingJawabanLv1 == 1) {
                                            score_lv1 = score_lv1 + 10;
                                            jml_jawaban_betul_lv1 = jml_jawaban_betul_lv1 +
                                                    1;
                                            System.out.println("#Right. Score : " +
                                                    score_lv1);
                                        }
                                    }
                                } else {
                                    answer_valid = true;
                                    jawabanLv1[idx_jawaban_lv1] = temp_jawaban;
                                    int hasilBandingJawabanLv1 = linearSearch(key1,
                                            jawabanLv1[idx_jawaban_lv1]);
                                    if (hasilBandingJawabanLv1 == 1) {
                                        score_lv1 = score_lv1 + 10;
                                        jml_jawaban_betul_lv1 = jml_jawaban_betul_lv1 + 1;
                                        System.out.println("#Right. Score : " + score_lv1);
                                    }
                                }

                            } else {
                                System.out.println("Karakter Nama Tidak Sesuai Ketentuan");
                            }

                        } while (!answer_valid);
                        idx_jawaban_lv1++;
                        jml_jawaban_lv1++;
                    } while (jml_jawaban_lv1 <= 10);
                    System.out.println("You had answered 10 times with " +
                            jml_jawaban_betul_lv1
                            + " right answers..\n");
                    System.out.println("Correct Answers : ");
                    printArray(key1);
                    System.out.println("\n");
                    if (score_lv1 < 70) {
                        do {
                            System.out.print("You Lose!! Try again.. \n"
                                    + "Do you want to retry [y/t]? ");
                            repetisi = input.next();
                            if ("t".equals(repetisi) || "T".equals(repetisi)
                                    || "y".equals(repetisi) || "Y".equals(repetisi)) {
                                if ("t".equals(repetisi) || "T".equals(repetisi)) {
                                    val_stop = true;
                                    ulang1 = false;
                                    System.exit(0);
                                }
                                val_repetisi = true;
                                ulang1 = true;
                                jml_jawaban_lv1 = 1;
                                idx_jawaban_lv1 = 0;
                                jml_jawaban_betul_lv1 = 0;
                                score_lv1 = 0;
                            } else {
                                System.out.println("\nKarakter Nama Tidak Sesuai Ketentuan");
                            }
                        } while (!val_repetisi);
                    } else {
                        ulang1 = false;
                    }
                }
// ------------------- Level 2
                System.out.println("\n");
                System.out.println("Level 2");
                System.out.println("-------");

                System.out.println("\t s \t e \t c \t a "
                        + "\t e \t n");


                do {
                    boolean answer_valid = false;
                    do {
                        String temp_jawaban;
                        System.out.print(jml_jawaban_lv2 + "> Your Answer : ");
                        temp_jawaban = input.next();
                        if (temp_jawaban.length() <= maxLengthAnswer
                                && temp_jawaban.length() >= minLengthAnswer) {
                            if (idx_jawaban_lv2 > 0) {
                                int hasilLinearSearch = linearSearch(jawabanLv2,
                                        temp_jawaban);
                                if (hasilLinearSearch == 1) {
                                    System.out.println("You had already type this "
                                            + "word before..");
                                } else {
                                    answer_valid = true;
                                    jawabanLv2[idx_jawaban_lv2] = temp_jawaban;
                                    int hasilBandingJawabanLv2 =
                                            linearSearch(key2, jawabanLv2[idx_jawaban_lv2]);
                                    if (hasilBandingJawabanLv2 == 1) {
                                        score_lv2 = score_lv2 + 10;
                                        jml_jawaban_betul_lv2 = jml_jawaban_betul_lv2 +
                                                1;
                                        System.out.println("#Right. Score : " +
                                                score_lv2);
                                    }
                                }
                            } else {
                                answer_valid = true;
                                jawabanLv2[idx_jawaban_lv2] = temp_jawaban;
                                int hasilBandingJawabanLv2 = linearSearch(key2,
                                        jawabanLv2[idx_jawaban_lv2]);
                                if (hasilBandingJawabanLv2 == 1) {
                                    score_lv2 = score_lv2 + 10;
                                    jml_jawaban_betul_lv2 = jml_jawaban_betul_lv2 + 1;
                                    System.out.println("#Right. Score : " + score_lv2);
                                }
                            }

                        } else {
                            System.out.println("Karakter Nama Tidak Sesuai Ketentuan");
                        }

                    } while (!answer_valid);
                    idx_jawaban_lv2++;
                    jml_jawaban_lv2++;
                } while (jml_jawaban_lv2 <= 10);
                System.out.println("You had answered 10 times with " +
                        jml_jawaban_betul_lv2
                        + " right answers..\n");
                System.out.println("Correct Answers : ");
                printArray(key2);
                System.out.println("\n");

                if (score_lv2 < 70) {
                    do {
                        System.out.print("You Lose!! Try again.. \n"
                                + "Do you want to retry [y/t]? ");
                        repetisi = input.next();
                        if ("t".equals(repetisi) || "T".equals(repetisi)
                                || "y".equals(repetisi) || "Y".equals(repetisi)) {
                            if ("t".equals(repetisi) || "T".equals(repetisi)) {
                                val_stop = true;
                                ulang2 = false;
                                System.exit(0);
                            }
                            val_repetisi = true;
                            jml_jawaban_lv2 = 1;
                            idx_jawaban_lv2 = 0;
                            jml_jawaban_betul_lv2 = 0;
                            score_lv2 = 0;
                            jml_jawaban_lv1 = 1;
                            idx_jawaban_lv1 = 0;
                            jml_jawaban_betul_lv1 = 0;
                            score_lv1 = 0;
                        } else {
                            System.out.println("\nKarakter Nama Tidak Sesuai Ketentuan");
                        }
                    } while (!val_repetisi);
                } else {
                    ulang2 = false;
                }
            }
// --------------------- Level 3
            System.out.println("Level 3");
            System.out.println("-------");

            System.out.println("\t h \t k \t r "
                    + "\t n \t e \t o");


            do{
                boolean answer_valid = false;
                do {
                    String temp_jawaban;
                    System.out.print(jml_jawaban_lv3 + "> Your Answer : ");
                    temp_jawaban = input.next();
                    if(temp_jawaban.length() <= maxLengthAnswer
                            && temp_jawaban.length() >= minLengthAnswer)
                    {
                        if(idx_jawaban_lv3 > 0){
                            int hasilLinearSearch = linearSearch(jawabanLv3,
                                    temp_jawaban);
                            if(hasilLinearSearch == 1){
                                System.out.println("You had already type this "
                                        + "word before..");
                            } else {
                                answer_valid=true;
                                jawabanLv3[idx_jawaban_lv3] = temp_jawaban;
                                int hasilBandingJawabanLv3 =
                                        linearSearch(key3, jawabanLv3[idx_jawaban_lv3]);
                                if(hasilBandingJawabanLv3 == 1){
                                    score_lv3 = score_lv3 + 10;
                                    jml_jawaban_betul_lv3 = jml_jawaban_betul_lv3 +
                                            1;
                                    System.out.println("#Right. Score : " +
                                            score_lv3);
                                }
                            }
                        } else {
                            answer_valid=true;
                            jawabanLv3[idx_jawaban_lv3] = temp_jawaban;
                            int hasilBandingJawabanLv3 = linearSearch(key3,
                                    jawabanLv3[idx_jawaban_lv3]);
                            if(hasilBandingJawabanLv3 == 1){
                                score_lv3 = score_lv3 + 10;
                                jml_jawaban_betul_lv3 = jml_jawaban_betul_lv3 + 1;
                                System.out.println("#Right. Score : " + score_lv3);
                            }
                        }

                    }else{
                        System.out.println("Karakter Nama Tidak Sesuai Ketentuan");
                    }

                }while(!answer_valid);
                idx_jawaban_lv3++;
                jml_jawaban_lv3++;
            }while(jml_jawaban_lv3 <= 10);
            System.out.println("You had answered 10 times with " +
                    jml_jawaban_betul_lv3
                    + " right answers..\n");
            System.out.println("Correct Answers : ");
            printArray(key3);
            System.out.println("\n");
            if(score_lv3 < 70){
                do {
                    System.out.print("You Lose!! Try again.. \n"
                            + "Do you want to retry [y/t]? ");
                    repetisi = input.next();
                    if("t".equals(repetisi) || "T".equals(repetisi)
                            || "y".equals(repetisi) || "Y".equals(repetisi))
                    {
                        if("t".equals(repetisi) || "T".equals(repetisi)){
                            val_stop=true;
                        }
                        val_repetisi=true;
                    }else{
                        System.out.println("\nKarakter Nama Tidak Sesuai Ketentuan");
                    }
                }while(!val_repetisi);
            } else {
                score_all = score_lv1 + score_lv2 + score_lv3;
                System.out.println("Overall Score : " + score_all);
                System.out.print("You Win!! \n"
                        + "Press ENTER to exit..");
                input.nextLine();
                val_stop=true;
            }
        }while(!val_stop);
    }

    public static int linearSearch(String[] arr, String key){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == null ? key == null : arr[i].equals(key)){
                return 1;
            }
        }
        return 0;
    }

    public static void printArray(String[] arr){
        int word_printed = 1;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + "\t");
            word_printed++;
            if(word_printed == 6){
                System.out.print("\n");
                word_printed = 1;
            }
        }
    }
}