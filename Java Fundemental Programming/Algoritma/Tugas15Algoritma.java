package Tugas12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Tugas15Algoritma {
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

    public static int[] generateRandomArray(int size, int bound) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(bound);
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int size = scanner.nextInt();
        System.out.print("Masukkan batas nilai random: ");
        int bound = scanner.nextInt();

        int[] arr = generateRandomArray(size, bound);

        Arrays.sort(arr);

        System.out.println("\nArray setelah diurutkan: " + Arrays.toString(arr));

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
