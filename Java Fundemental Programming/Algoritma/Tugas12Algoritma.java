package Algoritma;

import java.util.Scanner;

public class Tugas12Algoritma {
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

        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

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
