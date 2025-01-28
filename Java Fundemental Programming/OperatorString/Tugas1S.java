/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 23 - Januari - 2025
 * Kode program : ArrayList
*/

package OperatorString;

import java.util.Scanner;
public class Tugas1S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();

        System.out.println("Jumlah Karakter: " + kalimat.length());
        if (kalimat.length() < 10) {
            System.out.println("LOW");
        } else if (kalimat.length() < 50 && kalimat.length() >= 10) {
            System.out.println("MEDIUM");
        } else if (kalimat.length() >= 50) { 
            System.out.println("HIGH");
        }
    }
}
