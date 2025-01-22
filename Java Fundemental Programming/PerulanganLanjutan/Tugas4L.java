/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 12  - November - 2024
 * Kode program : Pengualangan
 */

package PerulanganLanjutan;

public class Tugas4L {
    public static void main(String[] args) {
        for (int ulang = 1; ulang <= 20; ulang++) {
            if (ulang % 2 != 0) {
                continue;
            }
            System.out.print(ulang + "\t");
        } 
    }
}
