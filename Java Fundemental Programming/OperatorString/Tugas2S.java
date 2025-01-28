/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 23 - Januari - 2025
 * Kode program : ArrayList
*/

package OperatorString;

import java.util.Scanner;
public class Tugas2S {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bonus = 0;
        int gPokok = 0;
        int kelipatan = 0;
        
        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();

        System.out.println("Jumlah Karakter: " + kalimat.length());
        if (kalimat.length() >= 100) {
            if (kalimat.length() > 100) {
                kelipatan = kalimat.length() * 100;
                gPokok += kelipatan;
            } else {
                gPokok = 10000;
            }
            System.out.println("Gaji Pokok: Rp. " + gPokok);
        } else if (kalimat.length() < 100 && kalimat.length() >= 50) {
            gPokok = 5000;
            System.out.println("Gaji Pokok: Rp. " + gPokok);
        } else if (kalimat.length() < 50) {
            gPokok = 2000;
            System.out.println("Gaji Pokok: Rp. " + gPokok);
        } 
        if (kalimat.length() >= 1000) {
            bonus = gPokok * 10/100;
            System.out.println("Gaji Pokok: " + gPokok);
            System.out.println("Bonus: " + bonus);
            System.out.println("Total Gaji Penulis: " + (gPokok + bonus));
        }

    }
}
