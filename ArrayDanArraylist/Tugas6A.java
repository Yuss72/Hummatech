/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 01 - Desember - 2024
 * Kode program : Array
 */

package ArrayDanArraylist;
import java.io.*;
public class Tugas6A {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("Masukkan Jumlah Angka Yang Akan Dimasukkan: ");
        int jA = Integer.parseInt(input.readLine());

        int[] angka = new int[jA];
        
        System.out.println("\nSilahlan Masukkan " + angka.length + " Angka:");
        for (int u = 0; u < jA; u++) {
            System.out.print("Angka ke-" + (u + 1) + ": ");
            angka[u] = Integer.parseInt(input.readLine());
        }

        int terbesar = angka[0];
        int terkecil = angka[0];

        for (int u = 0; u < jA; u++) {
            if (angka[u] > terbesar) {
                terbesar = angka[u];
            }
            if (angka[u] < terkecil) {
                terkecil = angka[u];
            }
        }

        System.out.println("\nAngka Yang Anda Masukkan Adalah: ");
        for (int u = 0; u < jA; u++) {
            System.out.print(angka[u] + " ");
        }
        
        System.out.println("\n\nAngka terbesar adalah: " + terbesar);
        System.out.println("Angka terkecil adalah: " + terkecil);
    }
}
