package org.hartomoro;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[5];

        while (true) {
            System.out.println("Menu Pilihan:");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Bubble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("Masukkan batas bawah: ");
                int lowerBound = scanner.nextInt();
                System.out.print("Masukkan batas atas: ");
                int upperBound = scanner.nextInt();
                generateRandomData(data, lowerBound, upperBound);
                System.out.println("Data acak: " + Arrays.toString(data));
            } else if (menu == 2) {
                System.out.println("Hasil Simulasi Bubble Sort - Ascending :");
                System.out.println("----------------------------------------");
                bubbleSortAscending(data);
                System.out.println("----------------------------------------");
            } else if (menu == 3) {
                System.out.println("Hasil Simulasi Selection Sort - Ascending :");
                System.out.println("-------------------------------------------");
                selectionSortAscending(data);
                System.out.println("-------------------------------------------");
            } else if (menu == 4) {
                System.out.println("Hasil Simulasi Bubble Sort - Descending :");
                System.out.println("-----------------------------------------");
                bubbleSortDescending(data);
                System.out.println("-----------------------------------------");
            } else if (menu == 5) {
                System.out.println("Hasil Simulasi Selection Sort - Descending");
                System.out.println("------------------------------------------");
                selectionSortDescending(data);
                System.out.println("------------------------------------------");
            } else if (menu == 6) {
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }

    private static void generateRandomData(int[] data, int lowerBound, int upperBound) {
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }
    }

    private static void bubbleSortAscending(int[] data) {
        int n = data.length;
        int[] sortedData = Arrays.copyOf(data, n);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedData[j] > sortedData[j + 1]) {
                    int temp = sortedData[j];
                    sortedData[j] = sortedData[j + 1];
                    sortedData[j + 1] = temp;
                }
                System.out.println(Arrays.toString(sortedData));
            }
        }
    }

    private static void selectionSortAscending(int[] data) {
        int n = data.length;
        int[] sortedData = Arrays.copyOf(data, n);

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (sortedData[j] < sortedData[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = sortedData[i];
            sortedData[i] = sortedData[minIndex];
            sortedData[minIndex] = temp;
            System.out.println(Arrays.toString(sortedData));
        }
    }

    private static void bubbleSortDescending(int[] data) {
        int n = data.length;
        int[] sortedData = Arrays.copyOf(data, n);

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortedData[j] < sortedData[j + 1]) {
                    int temp = sortedData[j];
                    sortedData[j] = sortedData[j + 1];
                    sortedData[j + 1] = temp;
                }
                System.out.println(Arrays.toString(sortedData));
            }
        }
    }

    private static void selectionSortDescending(int[] data) {
        int n = data.length;
        int[] sortedData = Arrays.copyOf(data, n);

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (sortedData[j] > sortedData[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = sortedData[i];
            sortedData[i] = sortedData[maxIndex];
            sortedData[maxIndex] = temp;
            System.out.println(Arrays.toString(sortedData));
        }
    }
}
