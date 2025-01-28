/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 23 - Januari - 2025
 * Kode program : ArrayList
*/

import java.util.ArrayList;
import java.util.Arrays;
public class Tugas15A {
    public static void main(String[] args) {
        ArrayList<Integer> angka = new ArrayList<> (Arrays.asList(10, 20, 30, 40, 50));

        for (int u = 0; u < angka.size(); u++) {
            System.out.print(angka.get(u) + "\t");
        }
    }
}
