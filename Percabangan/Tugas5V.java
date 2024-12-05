/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 4 - September - 2024
 * Kode program : Percabangan switch case
 *//

package Percabangan;

import java.util.Scanner;

public class Tugas5V {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        System.out.println("Masukkan angka 1 s/d 7: ");
        angka = input.nextInt();

        switch(angka) {
            case 1:
            System.out.println("Minggu");
            break;
            case 2:
            System.out.println("Senin");
            break;
            case 3:
            System.out.println("Selasa");
            break;
            case 4:
            System.out.println("Rabu");
            break;
            case 5:
            System.out.println("Kamis");
            break;
            case 6:
            System.out.println("Jum'at");
            break;
            case 7:
            System.out.println("Sabtu");
            break;
            default:
            System.out.println("Nomor yang dimasukkan tidak valid.");
        }
    }
}
