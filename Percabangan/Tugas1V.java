/*
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 3 - September - 2024
 * Kode program : Percabangan if
 */

package Percabangan;

import java.util.Scanner;

public class Tugas1V {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        int belanja;

        System.out.println("Inputkan total belanja anda: ");
        belanja = input.nextInt();

        if (belanja >= 500000) {
            System.out.println("Selamat Anda mendapatkan hadiah gantungan kunci");
        }
    }
}
