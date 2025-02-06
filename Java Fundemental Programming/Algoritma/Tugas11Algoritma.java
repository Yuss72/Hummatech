package Tugas12;

import java.util.Scanner;

public class Tugas11Algoritma {
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

        String[] arr = {"Misbahul", "Andre", "Ivan", "Andika", "Riyan", "Afrizal"};

        System.out.println("Data nama siswa:");
        for (String name : arr) {
            System.out.println(name);
        }

        System.out.print("\nMasukkan nama siswa yang ingin dicari: ");
        String key = scanner.nextLine();

        int result = sequentialSearch(arr, key);

        if (result != -1) {
            System.out.println("Nama " + key + " ditemukan pada indeks ke-" + result + ".");
        } else {
            System.out.println("Nama " + key + " tidak ditemukan dalam array.");
        }
    }
}
