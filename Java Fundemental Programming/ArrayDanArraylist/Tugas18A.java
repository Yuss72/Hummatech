/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 23 - Januari - 2025
 * Kode program : ArrayList
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Tugas18A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int total = 0;

        System.out.print("Silahkan Masukkan Jumlah Angka Yang Akan Diinputkan: ");
        int jAngka = input.nextInt();
        // flush scanner
        input.nextLine();

        ArrayList<Integer> angka = new ArrayList<>();

        for (int u = 0; u < jAngka; u++) {
            System.out.print("Inputkan Angka ke-" + (u + 1) + ": ");
            int iAngka = input.nextInt();
            angka.add(iAngka);
            total += iAngka;
        }
        double rr = total / jAngka;

        System.out.println("Total Angka Yang Diinputkan: " + total);
        System.out.println("Rata-rata angka yang diinputkan: " + rr);
    }
}
