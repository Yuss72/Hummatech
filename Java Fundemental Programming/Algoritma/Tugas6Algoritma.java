package Algoritma;

import java.util.Scanner;

public class Tugas6Algoritma {
    public static void selectionSortRightToLeft(int[] arr) {
        int n = arr.length;

        for (int i = n - 1; i > 0; i--) {
            int minIndex = i;

            for (int j = 0; j < i; j++) {
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

        selectionSortRightToLeft(arr);

        System.out.println("Array setelah diurutkan secara ascending (Selection Sort kanan ke kiri):");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
