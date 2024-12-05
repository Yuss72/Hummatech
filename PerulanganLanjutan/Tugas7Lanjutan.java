/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 12  - November - 2024
 * Kode program : Pengualangan
 */

package PerulanganLanjutan;
import java.util.Scanner;
public class Tugas7Lanjutan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukkan jumlah kolom yang di inginkan: ");
        int jumlahKolom = input.nextInt();
        System.out.print("Masukkan jumlah baris yang di inginkan: ");
        int jumlahBaris = input.nextInt();
 
        System.out.println("=== Hasil dari input anda ===");
        for (int baris = 1; baris <= jumlahBaris; baris++) {
            for (int kolom = 1; kolom <= jumlahKolom; kolom++) {
                System.out.print(baris + " ");
            }
            System.out.println();
        }
    }
}