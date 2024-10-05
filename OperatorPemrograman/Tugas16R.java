/*
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 3 - September - 2024
 * Kode program : Operator ternary
 */

import java.util.Scanner;

public class Tugas16R {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan nilai rata rata: ");
        double nilai = input.nextDouble();

        String hasil = (nilai >= 75) ? "Naik Kelas" : "Tidak naik kelas";

        System.out.println(hasil);
    }
}
