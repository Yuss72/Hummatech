/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 5 - Oktober - 2024
 * Kode program : Ganjil dan Genap
 */

package Percabangan;

import java.util.Scanner;

public class Tugas8V {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputAngka1;
        int inputAngka2;

        System.out.println("Masukkan nomor pertama: ");
        inputAngka1 = input.nextInt();
        System.out.println("Masukkan nomor kedua: ");
        inputAngka2 = input.nextInt();

        System.out.println("\n==== Output ====");
        if (inputAngka1 % 2 == 0) {
            System.out.println(inputAngka1 + " adalah bilangan genap");
        } else {
            System.out.println(inputAngka1 + " adalah bilangan ganjil");
        }

        if (inputAngka2 % 2 == 0) {
            System.out.println(inputAngka2 + " adalah bilangan genap");
        } else {
            System.out.println(inputAngka2 + " adalah bilangan ganjil");
        }
    }
}
