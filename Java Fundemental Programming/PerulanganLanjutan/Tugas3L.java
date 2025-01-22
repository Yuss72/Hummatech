/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 12  - November - 2024
 * Kode program : Pengualangan
 */

package PerulanganLanjutan;

public class Tugas3L {
    public static void main(String[] args) {

        int angka1 = 1;
        int angka2 = 0;

        for (int i = 1; i > 0; i++) {
            int deret = angka1 + angka2;
            if (deret >= 200) {
                break;
            }
            System.out.print(deret + " ");
            angka1 = angka2;
            angka2 = deret;
        }
    }  
}