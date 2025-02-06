package Tugas12;

import java.util.Arrays;
import java.util.Scanner;

public class Tugas14Algoritma {
      public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            }
            else if (arr[mid] > key) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = {85, 30, 55, 80, 100, 65, 35, 20, 70, 65, 10, 40, 82, 90};

        Arrays.sort(arr);

        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));

        System.out.print("Masukkan angka yang ingin dicari: ");
        int key = scanner.nextInt();

        int result = binarySearch(arr, key);

        if (result != -1) {
            System.out.println("Angka " + key + " ditemukan pada indeks ke-" + result + " setelah diurutkan.");
        } else {
            System.out.println("Angka " + key + " tidak ditemukan dalam array.");
        }
    }
}
