/* 
 * Nama : Yusuf Usman
 * Kelas : X RPL 1
 * Tanggal : 11 - Oktober - 2024
 * Kode program : Pengualangan
 */

package Perulangan;
import java.util.Scanner;
public class Tugas7O {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int penambahan = 2;
        int bilangan = 3;
        
        System.out.print("Masukkan jumlah deret yang ingin di tampilkan: ");
        int deret = input.nextInt();

        for (int ulang = 0; ulang < deret; ulang++) {
            System.out.println(bilangan);
            bilangan += penambahan;
            penambahan++;
        }
    }
}
