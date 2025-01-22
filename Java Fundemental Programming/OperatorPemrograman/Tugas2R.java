/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : ?
 * Kode program : Operator Pemrograman
 */

import java.io.*;
public class Tugas2R {
    public static void main(String[] args) throws IOException{
        BufferedReader hitung = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nilai a: ");
        int a = Integer.parseInt(hitung.readLine());
        System.out.print("Masukkan nilai b: ");
        int b = Integer.parseInt(hitung.readLine());
        System.out.print("Masukkan nilai c: ");
        int c = Integer.parseInt(hitung.readLine());

        int hasil = a + b * c;

        System.out.println("\n=== Output ===");
        System.out.println("Hasil: " + hasil);
    }
}
