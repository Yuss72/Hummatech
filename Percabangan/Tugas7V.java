/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 5 - September - 2024
 * Kode program : Maksimum dan Minimum
 */

package Percabangan;

import java.util.Scanner;

public class Tugas7V {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputAngka1;
        int inputAngka2;
        int max;
        int min;

        System.out.println("Masukkan nomor pertama: ");
        inputAngka1 = input.nextInt();
        System.out.println("Masukkan nomor kedua: ");
        inputAngka2 = input.nextInt();

        if (inputAngka1 > inputAngka2) {
            max = inputAngka1;
            min = inputAngka2;
        } else {
            max = inputAngka2;
            min = inputAngka1;
        }

        System.out.println("\n==== Output ====");
        System.out.println("Angka Maksimal: " + max);
        System.out.println("Angka Minimum: " + min);
    }
}
