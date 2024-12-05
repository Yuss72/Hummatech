/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 12  - November - 2024
 * Kode program : Pengualangan
 */

package PerulanganLanjutan;

public class Tugas5L {
    public static void main(String[] args) {
        for (int ulang = 1; ulang <= 20; ulang++) {
            if (ulang > 5 && ulang <= 15) {
                continue;
            }
            System.out.print(ulang + "\t");
        }
    }
}
