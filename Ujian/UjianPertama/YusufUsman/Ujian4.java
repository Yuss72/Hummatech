/* Nama : Yusuf Usman
 * Kelas : X RPL - 1
 * Tanggal : 11 - Desember - 2024
 * Kode Program : Menghitung Diskon Dan Total Bayar
 */

import java.util.Scanner;
public class Ujian4 {
    public static void main(String[] args) {
        try (Scanner romi = new Scanner(System.in)) {
            int diskon;
            int sisa;
            int bayar;
            
            System.out.print("Masukkan Jumlah Uang: ");
            int totalB = romi.nextInt();
            System.out.println();
            
            if (totalB >= 500000 && totalB <= 1000000) {
                diskon = totalB * 10/100;
                bayar = totalB - diskon;
                System.out.println("Selamat! Anda Mendapatkan Diskon 10%\nJadi Total Belanja Anda Sekarang Adalah Rp." + bayar);
            } else if (totalB > 1000000) {
                diskon = totalB * 20/100;
                bayar = totalB - diskon;
                System.out.println("Selamat! Anda Mendapatkan Diskon 20%\nJadi Total Belanja Anda Sekarang Adalah Rp." + bayar);
            } else {
                sisa = 500000 - totalB;
                System.out.println("Anda tidak mendapatkan diskon, silahkan tambah belanja sebesar " + sisa + " untuk mendapatkan diskon 10%");
            }
        }
    }
}
