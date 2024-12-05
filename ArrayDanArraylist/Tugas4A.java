/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 01 - Desember - 2024
 * Kode program : Array
 */

package ArrayDanArraylist;

public class Tugas4A {
    public static void main(String[] args) {
        int angka[] = {10, 9, 30, 45, 78, 34, 11, 8, 5, 45, 90, 102, 56, 3};

        for (int u = 0; u < angka.length; u++) {
            if (angka[u] % 2 == 1) {
                System.out.println(angka[u]);
            }
        }
    }
}
