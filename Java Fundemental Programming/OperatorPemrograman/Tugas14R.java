/*
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 3 - September - 2024
 * Kode program : Data Siswa
 * 
 * Di tugas tugas saya sebelumnya lupa untuk mengetik ini
 */

import java.util.Scanner;

public class Tugas14R {
    public static void main(String[] args) {
        Scanner dataSiswa = new Scanner(System.in);

        int[] data = {1001, 1002, 1003, 1004};

        System.out.println("Silahkan masukkan NIS anda: ");
        int inputUser = dataSiswa.nextInt();

        boolean lulus = (inputUser == 1001) || (inputUser == 1002) || (inputUser == 1003) || (inputUser == 1004);

        System.out.println("Anda " + lulus);
    }
}

/*
 * true = lulus
 * false = tidak lulus
 */