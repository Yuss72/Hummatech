/* Nama : Yusuf Usman
 * Kelas : X RPL - 1
 * Tanggal : 11 - Desember - 2024
 * Kode Program : Menghitung Diskon Dan Total Bayar
 */

import java.util.Scanner;
public class Ujian5 {
    public static void main(String[] args) {
        try (Scanner romi = new Scanner(System.in)) {
            System.out.print("Tentukan Panjang Deret: ");
            int pD = romi.nextInt();
            int u = 1;
            
            System.out.print("\nBilangan Ganjil: ");
            do {
                if (u % 2 == 1) {
                    System.out.print(u + " ");
                }
                u++;
            } while (u <= pD);
            u = 1;

            System.out.print("\nBilangan Genap: ");
            do {
                if (u % 2 == 0) {
                    System.out.print(u + " ");
                }
                u++;
            } while (u <= pD);
        }
    }
}
