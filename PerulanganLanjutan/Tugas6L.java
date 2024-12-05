/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 12  - November - 2024
 * Kode program : Pengualangan
 */

package PerulanganLanjutan;
import java.util.Scanner;
public class Tugas6L {
    public static void main(String[] args) {
        Scanner romi = new Scanner(System.in);
        int jumlah = 0;

        for (int ulang = 1; ulang <= 5; ulang++) {
            System.out.print("Masukkan 5 angka: ");
            int angka = romi.nextInt(); 

            if (angka % 5 != 0) {
                continue;
            }

            jumlah += angka;
        }

        System.out.println("Ketika hanya angka kelipatan 5 yang dijumlahkan menjadi: " + jumlah);
    }
}
