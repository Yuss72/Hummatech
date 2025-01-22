/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 05 - Desember - 2024
 * Kode program : Array
 */

public class Tugas9A {
    public static void main(String[] args) {
        int[][] angka = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        int total = 0;

        for (int k = 0; k < angka.length; k++) {
            System.out.print("Total Penjumlahan: ");
            for (int b = 0; b < angka[k].length; b++) {
                System.out.print(angka[k][b] + " ");
                total += angka[k][b];
            }
            System.out.print("= " + total + "\n");
            total = 0;
        }
    }
}
