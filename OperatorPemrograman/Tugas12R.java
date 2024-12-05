

import java.io.*;

public class Tugas12R {
    public static void main(String[] args) throws IOException {
        BufferedReader kualifikasi = new BufferedReader(new InputStreamReader(System.in));

        int minTinggi = 160;
        int minNilaiUN = 80;

        // input user
        System.out.println("Masukkan tinggi badan anda: ");
        int tinggi = Integer.parseInt(kualifikasi.readLine());
        System.out.println("Masukkan Nilai UN anda: ");
        int nilaiUN = Integer.parseInt(kualifikasi.readLine());

        // proses
        System.out.println(tinggi > minTinggi && nilaiUN > minNilaiUN);
    }
}
