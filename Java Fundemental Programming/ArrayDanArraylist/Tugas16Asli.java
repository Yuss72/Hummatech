/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 23 - Januari - 2025
 * Kode program : ArrayList
*/

import java.util.ArrayList;
public class Tugas16Asli {
    public static void main(String[] args) {
        ArrayList<Object> namaUsia = new ArrayList<>();

        namaUsia.add("Mochammad Romi");
        namaUsia.add(16);

        namaUsia.add("Yusuf Usman");
        namaUsia.add(16);

        namaUsia.add("Galvin Agustian");
        namaUsia.add(16);

        for (int u = 0; u < namaUsia.size(); u++) {
            if (namaUsia.get(u) instanceof String) {
                System.out.print("Nama: " + namaUsia.get(u));
            } else if (namaUsia.get(u) instanceof Integer) {
                System.out.println(" | Usia: " + namaUsia.get(u));
            }
        }
    }
}
