/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 22 - Januari - 2025
 * Kode program : ArrayList
*/

import java.util.ArrayList;
public class Tugas14A {
    public static void main(String[] args) {
        ArrayList<String> nama = new ArrayList<>();

        nama.add("Steve Jobs");
        nama.add("Bill Gates");
        nama.add("Mark Zuckerberg");
        nama.add("Elon Musk");

        for (int u = 0; u < nama.size(); u++) {
            System.out.println(nama.get(u));
        }

        nama.remove("Bill Gates");

        System.out.println();
        for (int u = 0; u < nama.size(); u++) {
            System.out.println(nama.get(u));
        }
    }
}
