/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 05 - Desember - 2024
 * Kode program : Array
 */

 package ArrayDanArraylist;
public class Tugas10A {
    public static void main(String[] args) {
        // Data
        String nama[] = {"Kenzo Ismail", "Desmon Dana", "Kayla Isabela", "Khansa Zakira"};
        int[][] nilai = {
            {81, 90, 62},
            {60, 82, 87},
            {89, 59, 65},
            {77, 75, 60}
        };
        int[] rata = new int[nama.length];

        int no = 0;
        int total = 0;
        int rata2 = 0;

        // Menampilkan Data Dan Tempat Proses Menghitung
        System.out.print("No.\tNama\t\tNilai1\t\tNilai2\t\tNilai3\t\t\n");
        for (int b = 0; b < nilai.length; b++) {
            System.out.print((no + 1) + "\t" + nama[b] + "\t");
            for (int k = 0; k < nilai[b].length; k++) {
                System.out.print(nilai[b][k] + "\t\t");
                total += nilai[b][k];
            }
            System.out.println();
            
            rata2 = total / nilai[b].length;
            rata[b] = rata2;
            total = 0;
            no++;
        }

        // Menampilkan Rata Rata
        System.out.println("\nNilai Rata-Rata Masing Masing Siswa Adalah: ");
        for (int u = 0; u < rata.length; u++) {
            System.out.println("Nilai Rata Rata " + nama[u] + " Adalah: " + rata[u]);
        }
    }
}
