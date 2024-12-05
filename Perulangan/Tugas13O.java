/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 31  - Oktober - 2024
 * Kode program : Pengualangan
 */

package Perulangan;
import java.util.Scanner;
public class Tugas13O {
    public static void main(String[] args) {
        Scanner galvin = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret fibonacci: ");
        int jumlahDeret = galvin.nextInt();

        int angka1 = 1;
        int angka2 = 0;
        int ulang = 0;

        do {
            int hasil = angka1 + angka2;
            System.out.print(hasil + " ");
            angka1 = angka2;
            angka2 = hasil;
            ulang++;
        } while (ulang < jumlahDeret);
    }
}
