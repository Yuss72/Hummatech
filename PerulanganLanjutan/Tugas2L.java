/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 12  - November - 2024
 * Kode program : Pengualangan
 */

package PerulanganLanjutan;
import java.util.Scanner;
public class Tugas2L {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputUser = 1;
        while (inputUser > 0) {
            System.out.print("Program akan berhenti jika anda memasukkan angka '0' \nMasukkan angka: ");
            inputUser = input.nextInt();

            if (inputUser == 0) {
                System.out.println("Program Telah Berhenti!");
                break;
            }
        }
    }
}
