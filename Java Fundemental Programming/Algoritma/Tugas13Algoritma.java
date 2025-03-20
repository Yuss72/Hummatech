package Algoritma;

import java.util.Scanner;

public class Tugas13Algoritma {
      public static int sequentialSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] arr = new String[n];

        System.out.println("Masukkan elemen array (nama atau kata):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        System.out.print("Masukkan kata yang ingin dicari: ");
        String key = scanner.nextLine();

        int result = sequentialSearch(arr, key);

        if (result != -1) {
            System.out.println("Kata \"" + key + "\" ditemukan pada indeks ke-" + result + ".");
        } else {
            System.out.println("Kata \"" + key + "\" tidak ditemukan dalam array.");
        }
    }
}
