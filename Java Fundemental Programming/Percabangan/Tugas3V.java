/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 4 - September - 2024
 * Kode program : Percabangan if dan else
 */

package Percabangan;

import java.util.Scanner;

public class Tugas3V {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        
        System.out.println("Masukkan nilai anda (100 - 0): ");
        nilai = input.nextInt();

        if (nilai <= 100 && nilai >= 81) {
            System.out.println("Nilai anda A");
        } else if (nilai <= 80 && nilai >= 71) {
            System.out.println("Nilai anda B");
        } else if (nilai <= 70 && nilai >= 51) {
            System.out.println("Nilai anda C");
        } else if (nilai <= 50 && nilai >= 21) {
            System.out.println("Nilai anda D");
        } else if (nilai <= 20 && nilai >= 0) {
            System.out.println("Nilai anda E");
        } else {
            System.out.println("Tolong masukkan nilai yang valid.");
        }
        input.close();
    }   
}
