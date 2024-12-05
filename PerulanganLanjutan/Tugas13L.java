/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 14  - November - 2024
 * Kode program : Pengualangan
 */

package PerulanganLanjutan;
import java.util.Scanner;

public class Tugas13L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int baris = 1; baris <= 5; baris++) {
            for (int kolom = 1; kolom <= baris; kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

