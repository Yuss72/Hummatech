/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 5 - Oktober - 2024
 * Kode program : Menggabungan Tugas 7 dan Tugas 8
 */

package Percabangan;

import java.util.Scanner;

public class Tugas9V {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                Pilihan menu:
                1. Penentuan angka terbesar.
                2. Penentuan angka ganjil dan genap
                """);
        System.out.println("Masukkan pilihan anda: ");
        int inputUser = input.nextInt();

        switch(inputUser) {
            // Opsi Besar dan Kecil
            case 1:
            int inputBesarKecil1;
            int inputBesarKecil2;
            int max;
            int min;
    
            System.out.println("\n=== Penentuan angka terbesar ===");
            System.out.println("Masukkan nomor pertama: ");
            inputBesarKecil1 = input.nextInt();
            System.out.println("Masukkan nomor kedua: ");
            inputBesarKecil2 = input.nextInt();
    
            if (inputBesarKecil1 > inputBesarKecil2) {
                max = inputBesarKecil1;
                min = inputBesarKecil2;
            } else {
                max = inputBesarKecil2;
                min = inputBesarKecil1;
            }
    
            System.out.println("\n==== Output ====");
            System.out.println("Angka Maksimum: " + max);
            System.out.println("Angka Minimum: " + min);
            break;

            // Opsi Ganjil dan Genap
            case 2:
            int inputGanjilGenap1;
            int inputGanjilGenap2;
    
            System.out.println("\n=== Penentuan angka ganjil dan genap ===");
            System.out.println("Masukkan nomor pertama: ");
            inputGanjilGenap1 = input.nextInt();
            System.out.println("Masukkan nomor kedua: ");
            inputGanjilGenap2 = input.nextInt();
    
            System.out.println("\n==== Output ====");
            if (inputGanjilGenap1 % 2 == 0) {
                System.out.println(inputGanjilGenap1 + " adalah bilangan genap");
            } else {
                System.out.println(inputGanjilGenap1 + " adalah bilangan ganjil");
            }
    
            if (inputGanjilGenap2 % 2 == 0) {
                System.out.println(inputGanjilGenap2 + " adalah bilangan genap");
            } else {
                System.out.println(inputGanjilGenap2 + " adalah bilangan ganjil");
            }
            break;

            default:
            System.out.println("\nPilihan anda tidak ada di opsi tersebut.");

            input.close();
        }
    }
}
