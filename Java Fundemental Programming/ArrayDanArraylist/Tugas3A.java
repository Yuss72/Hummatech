/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 01 - Desember - 2024
 * Kode program : Array
 */

import java.io.*;
public class Tugas3A {
    public static void main(String [] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String[] merkLaptop = new String[3];
        String[] merkHp = new String[3];

        System.out.println("Silahkan Masukkan " + merkLaptop.length + " Merek Laptop:");
        for (int u = 0; u < 3; u++) {
            System.out.print("Merek Laptop ke-" + (u + 1) + ": ");
            merkLaptop[u] = input.readLine();
        }
        System.out.println();
        System.out.println("Silahkan Masukkan " + merkHp.length + " Merek HandPhone:");
        for (int u = 0; u < 3; u++) {
            System.out.print("Merek HandPhone ke-" + (u + 1) + ": ");
            merkHp[u] = input.readLine();
        }

        System.out.println("\nMerek Barang Yang Anda Masukkan Adalah: ");
        System.out.print("Merek Laptop: ");
        for (int u = 0; u < 3; u++) {
            System.out.print(merkLaptop[u] + " ");
        }
        System.out.println();
        System.out.print("Merek HandPhone: ");
        for (int u = 0; u < 3; u++) {
            System.out.print(merkHp[u] + " ");
        }
    }
}
