/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 20   - Desember - 2024
 * Kode program : Array
*/

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
            String   = input.readLine();
            nama[u] = nama2;
        }
        System.out.println();

        int[][] nilai = new int[nama.length][3];

        for (int b = 0; b < nilai.length; b++) {
            System.out.println("Silahkan Masukkan 3 Nilai dari " + nama[b] + ": ");
            for (int k = 0; k < nilai[b].length; k++) {
                System.out.print("Nilai ke-" + (k + 1) + ": ");
                int nSiswa = Integer.parseInt(input.readLine());
                nilai[b][k] = nSiswa;
            }
            System.out.println();
        }    

        int no = 0;
        int total = 0;
        int rata2;

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

        System.out.println("\n=== Nilai Rata-Rata Siswa ===");
        for (int u = 0; u < rata.length; u++) {
            String nHuruf = " ";
            if (rata[u] >= 81 && rata[u] <= 100) {
                nHuruf = "Nilai A";
            } else if (rata[u] >= 71 && rata[u] <= 80) {
                nHuruf = "Nilai B";
            } else if (rata[u] >= 51 && rata[u] <= 70) {
                nHuruf = "Nilai C";
            } else if (rata[u] >= 31 && rata[u] <= 50) {
                nHuruf = "Nilai D";
            } else if (rata[u] >= 0 && rata[u] <= 30) {
                nHuruf = "Nilai E";
            }
            System.out.println(nama[u] + ": " + rata[u] + " - - > " + nHuruf);
        }
    }
}