package Algoritma;

import java.util.Scanner;

public class Tugas7Algoritma {
    public static void selectionSortLeftToRight(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
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

        System.out.println("Array sebelum diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        selectionSortLeftToRight(arr);

        System.out.println("\nArray setelah diurutkan secara ascending:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
