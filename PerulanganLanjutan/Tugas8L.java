/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 13  - November - 2024
 * Kode program : Pengualangan
 */

package PerulanganLanjutan;

public class Tugas8L {
    public static void main (String[] args) {
        int hasil = 0;

        for (int baris = 1; baris <= 5; baris++) {
            for (int ulang = 1; ulang <= 5; ulang++) {
                hasil = baris * ulang;
                
                System.out.print(hasil + " ");
            }
            System.out.println();
        }
    }
}
