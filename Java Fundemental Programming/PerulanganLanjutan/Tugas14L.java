/* 
* Nama : Yusuf Usman
* Kelas : X RPL 1
* Tanggal : 14  - November - 2024
* Kode program : Pengualangan
*/

package PerulanganLanjutan;

public class Tugas14L {
    public static void main(String[] args) {
        int tinggi = 10;

        for (int baris = 1;  baris <= tinggi; baris++) {
            for (int kosong = 0; kosong <= tinggi - baris - 1; kosong++) {
                System.out.print("  ");
            }
            for (int kolom = 1; kolom <= (baris * 2 - 1); kolom++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
