/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 06   - Desember - 2024
 * Kode program : Array
*/

package ArrayDanArraylist;
import java.io.*;
public class Tugas11A {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Silahkan Masukkan Jumlah Nama Siswa: ");
        int jN = Integer.parseInt(input.readLine());

        String nama[] = new String[jN];
        int[] rata = new int[nama.length];

        for (int u = 0; u < nama.length; u++) {
            System.out.print("Siswa ke-" + (u + 1) + ": ");
            String nama2 = input.readLine();
            nama[u] = nama2;
        }
        System.out.println();

        int[][] nilai = new int[nama.length][3];

        for (int b = 0; b < nilai.length; b++) {
            System.out.println("Silahkan Masukkan 3 Nilai dari " + nama[b] + ": ");
            for (int k = 0; k < nilai.length; k++) {
                System.out.print("Nilai ke-" + (k + 1) + ": ");
                int nSiswa = Integer.parseInt(input.readLine());
                nilai[b][k] = nSiswa;
            }
            System.out.println();
        }    

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