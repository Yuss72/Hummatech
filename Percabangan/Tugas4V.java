/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 4 - September - 2024
 * Kode program : Percabangan if, else dan nested if
 */

package Percabangan;

import java.util.Scanner;

public class Tugas4V {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merk;
        int ukuran;

        System.out.println("Masukkan merk produk (ABC / DEF): ");
        merk = input.nextLine().toUpperCase();
        System.out.println("Masukkan ukuran baju (30 - 34): ");
        ukuran = input.nextInt();

        if (merk.equals("ABC")) {
            if (ukuran <= 30 && ukuran >= 26) {
                System.out.println("Harga yang harus dibayarkan adalah Rp. 160.000");
            } else if (ukuran >= 31 && ukuran <= 34) {
                System.out.println("Harga yang harus dibayarkan adalah Rp. 180.000");
            } else {
                System.out.println("Tolong masukkan nomor ukuran yang valid.");
            }
        } else if (merk.equals("DEF")) {
            if (ukuran <= 30 && ukuran >= 26) {
                System.out.println("Harga yang harus dibayarkan adalah Rp. 210.000");
            } else if (ukuran >= 31 && ukuran <= 34) {
                System.out.println("Harga yang harus dibayarkan adalah Rp. 220.000");
            } else {
                System.out.println("Tolong masukkan nomor ukuran yang valid.");
            }
        } else {
            System.out.println("Nama merk yang di masukkan tidak dapat dikenali.");
        }
        input.close();
    }
}
