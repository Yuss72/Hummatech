/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 30  - Oktober - 2024
 * Kode program : Pengualangan
 */

package Perulangan;
import java.util.Scanner;
public class Tugas11O {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret yang ingin di tampilkan: ");
        int jumlahDeret = input.nextInt();

        System.out.print("Deret Ganjil: ");
        int ulang = 0;
        int angka = 1;
        do {
            if (angka % 2 != 0) {
                System.out.print(angka + " ");
                ulang++;
            }
            angka++;
        } while (ulang < jumlahDeret);

        System.out.print("\nDeret Genap: ");
        ulang = 0;
        angka = 1;
        do {
            if (angka % 2 == 0) {
                System.out.print(angka + " ");
                ulang++;
            }
            angka++;
        } while (ulang < jumlahDeret);
    }
}
