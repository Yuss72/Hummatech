/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 13  - November - 2024
 * Kode program : Pengualangan
 */

package PerulanganLanjutan;
import java.util.Scanner;

public class Tugas9L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kolom = 1;

        System.out.print("Silahkan masukkan panjang sisi Persegi Sama Sisi: ");
        int inputPanjang = input.nextInt();

        for (int baris = 1; baris <= inputPanjang; baris++) {
            for (int ulang = 1; ulang <= inputPanjang; ulang++) {
                System.out.print("* ");
            }
            System.out.println();
            kolom++;
        }
    }
}
