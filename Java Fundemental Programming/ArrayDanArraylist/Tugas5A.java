/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 01 - Desember - 2024
 * Kode program : Array
 */

import java.io.*;
public class Tugas5A {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("Masukkan Jumlah Angka: ");
        int jA = Integer.parseInt(input.readLine());

        int[] angka = new int[jA];
        int total = 0;
        
        System.out.println("Silahlan Masukkan " + angka.length + " Angka:");
        for (int u = 0; u < jA; u++) {
            System.out.print("Angka ke-" + (u + 1) + ": ");
            angka[u] = Integer.parseInt(input.readLine());
            total += angka[u];
        }

        System.out.println("\nAngka Yang Anda Masukkan Adalah: ");
        for (int u = 0; u < jA; u++) {
            System.out.print(angka[u] + " ");
        }
        System.out.println("\nTotal Dari Angka Yang Dimasukkan Yaitu: " + total);
    }
}
