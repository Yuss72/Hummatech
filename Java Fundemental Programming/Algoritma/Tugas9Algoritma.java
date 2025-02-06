package Tugas12;

import java.util.Scanner;

public class Tugas9Algoritma {
    public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {5, 6, 9, 2, 8, 1, 7};

        System.out.print("Masukkan angka yang ingin dicari: ");
        int key = scanner.nextInt();

        int result = sequentialSearch(arr, key);

        if (result != -1) {
            System.out.println("Angka " + key + " ditemukan pada indeks ke-" + result + ".");
        } else {
            System.out.println("Angka " + key + " tidak ditemukan dalam array.");
        }
    }
}
