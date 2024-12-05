/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 31  - Oktober - 2024
 * Kode program : Pengualangan
 */

package Perulangan;

import java.util.Scanner;

public class Tugas12O {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputUser;
        do {
            System.out.print("""
                Silahkan pilih nomor dari ketiga opsi tersebut:
                1. Penjumlahan
                2. Pengurangan
                3. Keluar

                Masukkan pilihan Anda (1/2/3): 
                """);
            inputUser = input.nextInt();

            switch(inputUser) {
                case 1:
                System.out.println("\nAnda memilih Penjumlahan!\n");
                break;
                case 2:
                System.out.println("\nAnda memilih Pengurangan!\n");
                break;
                default:
                System.out.println("\nMasukkan pilihan yang valid!\n");
                break;
            }
        } while (inputUser != 3);

        System.out.println("\nAnda berhasil keluar!\n");
    }
}