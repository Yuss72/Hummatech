/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 23 - Januari - 2025
 * Kode program : ArrayList
*/

import java.util.Scanner;
import java.util.ArrayList;
public class Tugas17A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> mLaptop = new ArrayList<>();
        int iUser = 1;

        do {
            System.out.print("""
                    \nPilihan Menu:
                    1. Menambahkan data merk laptop
                    2. Melihat daftra nama merk laptop
                    0. Keluar
                    """);
            System.out.print("Pilih nomor menu: ");
            iUser = input.nextInt();
            // flush scanner
            input.nextLine();

            switch (iUser) {
                case 0:
                    System.out.println("Sistem Telah Berhenti!");
                    break;
                case 1:
                    System.out.println("Silahkan Masukkan Merk Laptop: ");
                    String iMLaptop = input.nextLine();
                    mLaptop.add(iMLaptop);
                    break;
                case 2:
                    System.out.println("Daftar Nama Laptop: ");
                    for (int u = 0; u < mLaptop.size(); u++) { 
                        System.out.println((u + 1) + ". " + mLaptop.get(u));
                    }   break;
                default:
                    break;
            }
        } while (iUser > 0);
    }
}
