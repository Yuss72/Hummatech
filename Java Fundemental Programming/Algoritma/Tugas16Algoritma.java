package Algoritma;

import java.util.Arrays;
import java.util.Random;

public class Tugas16Algoritma {
      public static int sequentialSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {9, 6, 4, 3, 7, 1, 6, 10, 20, 61, 43, 80, 100, 54, 32, 36, 75, 81, 17, 19, 1020, 55, 57, 82, 84, 16, 21, 28, 99, 89, 87, 73, 74, 76, 78, 79, 83, 85};

        Random rand = new Random();
        int key = arr[rand.nextInt(arr.length)];

        long startTime = System.nanoTime();
        int resultSeq = sequentialSearch(arr, key);
        long endTime = System.nanoTime();
        long durationSeq = endTime - startTime;
        System.out.println("Sequential Search - Key: " + key + " ditemukan pada indeks ke-" + resultSeq);
        System.out.println("Waktu eksekusi Sequential Search: " + durationSeq + " nanodetik");

        Arrays.sort(arr);
        startTime = System.nanoTime();
        int resultBin = binarySearch(arr, key);
        endTime = System.nanoTime();
        long durationBin = endTime - startTime;
        System.out.println("Binary Search - Key: " + key + " ditemukan pada indeks ke-" + resultBin);
        System.out.println("Waktu eksekusi Binary Search: " + durationBin + " nanodetik");

        if (durationSeq < durationBin) {
            System.out.println("Sequential Search lebih cepat.");
        } else {
            System.out.println("Binary Search lebih cepat.");
        }
    }
}
